package com.zhupp.ems.util.mqtt;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

@Slf4j
public class MyMqttCallback implements MqttCallback {
    private MyMqttClient myMqttClient;

    public MyMqttCallback(MyMqttClient myMqttClient) {
        this.myMqttClient = myMqttClient;
    }

    @Override
    public void connectionLost(Throwable throwable) {
        log.error("连接断开，正在重连...");
        long reconnectTimes = 1;
        while (true) {
            try {
                if (MyMqttClient.getClient().isConnected()) {
                    log.warn("mqtt reconnect success ");
                    return;
                }
                log.warn("mqtt reconnect times={} try again...", reconnectTimes++);
                MyMqttClient.getClient().reconnect();

            } catch (MqttException e) {
                log.error("", e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {

        log.info("接收消息主题：{}，接收消息内容：{}", s, new String(mqttMessage.getPayload()));
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
        log.info("deliveryComplete={}", iMqttDeliveryToken.isComplete());
    }
}
