package com.zhupp.ems.util.mqtt;

import com.google.gson.Gson;
import com.zhupp.ems.util.MyMqttClient;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MqttFactory {
    @Value("${mqtt.host}")
    private String host;
    @Value("${mqtt.clientId}")
    private String clientId;
    @Value("${mqtt.username}")
    private String username;
    @Value("${mqtt.password}")
    private String password;
    @Value("${mqtt.timeout}")
    private int timeout;
    @Value("${mqtt.keepalive}")
    private int keepalive;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Bean
    public MyMqttClient myMqttClient() {

        MyMqttClient myMqttClient = new MyMqttClient(host, username, password, clientId, timeout, keepalive);
        for (int i = 0; i < 5; i++) {
            try {
                myMqttClient.connect();
                final String sql = "insert into ems_data values(null, ?, ? ,CURRENT_TIMESTAMP, ?, ?)";
                final Gson gson = new Gson();
                myMqttClient.subscribe("+/#", 1, new IMqttMessageListener() {
                    @Override
                    public void messageArrived(String topic, MqttMessage message) throws Exception {
                        MqttMsgEt mqttMsgEt = null;
                        try {
                            mqttMsgEt = gson.fromJson(message.toString(), MqttMsgEt.class);
                        } catch (Exception e) {
                            System.out.println("Gson 转换失败！");
                        }
                        if (mqttMsgEt == null) {
                            System.out.println("mqttMsgEt为null！");
                            return;
                        }
                        int result = jdbcTemplate.update(sql, mqttMsgEt.services.data.toString(), "1", topic, mqttMsgEt.msg_id);
                        System.out.println(topic);
                        System.out.println(message.toString());
//                        System.out.println(mqttMsgEt.services.data);
                        System.out.println("result : " + result);
                    }
                });
                System.out.println("已经订阅了所有 cid");

                Thread.sleep(2000);
                return myMqttClient;
            } catch (MqttException | InterruptedException e) {
                e.printStackTrace();
            }
        }
        log.error("mqtt connect fail");
        return null;
    }
}
