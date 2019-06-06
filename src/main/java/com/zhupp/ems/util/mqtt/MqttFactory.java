package com.zhupp.ems.util.mqtt;

import com.zhupp.ems.util.MyMqttClient;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MqttFactory {
    @Value("${mqtt.host}")
    private  String host;
    @Value("${mqtt.clientId}")
    private  String clientId;
    @Value("${mqtt.username}")
    private String username;
    @Value("${mqtt.password}")
    private String password;
    @Value("${mqtt.timeout}")
    private  int timeout;
    @Value("${mqtt.keepalive}")
    private  int keepalive;

    @Bean
    public MyMqttClient myMqttClient() {

         MyMqttClient myMqttClient = new MyMqttClient(host,username,password,clientId,timeout,keepalive);
        for (int i = 0; i < 5; i++) {
            try {
                myMqttClient.connect();
                Thread.sleep(2000);
                return myMqttClient;
            } catch (MqttException e) {
                e.printStackTrace();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        log.error("mqtt connect fail");
        return null;
    }
}
