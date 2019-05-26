package com.zhupp.ems.util.mqtt;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class MqttConfiguration {

    @Value("${mqtt.host}")
    String host;
    @Value("${mqtt.username}")
    String username;
    @Value("${mqtt.password}")
    String password;
    @Value("${mqtt.clientId}")
    String clientId;
    @Value("${mqtt.timeout}")
    int timeOut;
    @Value("${mqtt.keepalive}")
    int keepAlive;

    @Bean
    public MyMqttClient myMqttClient() {
        MyMqttClient myMqttClient = new MyMqttClient(host, username, password, clientId, timeOut, keepAlive);
        for (int i = 0; i < 10; i++) {
            try {
                myMqttClient.connect();
                return myMqttClient;
            } catch (MqttException e) {
                log.error("MQTT connect exception,connect time="+i);
            }try{
                Thread.sleep(2000);
            }catch(InterruptedException e1){
                e1.printStackTrace();
            }
        }
        return myMqttClient;
    }
}
