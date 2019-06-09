package com.zhupp.ems.util;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.beans.factory.annotation.Value;

@Slf4j
public class MyMqttClient {
    private static MqttClient client;

    public static MqttClient getClient() {
        return client;
    }

    public static void setClient(MqttClient client) {
        MyMqttClient.client=client;
    }
    @Value("${mqtt.host}")
    private String host;
    @Value("${mqtt.username}")
    private String username;
    @Value("${mqtt.password}")
    private String password;
    @Value("${mqtt.clientId}")
    private String clientId;
    @Value("${mqtt.timeout}")
    private int timeout;
    @Value("${mqtt.keepalive}")
    private int keepalive;

    public MyMqttClient(String host,String username,String password,String clientId,int timeout, int keepalive){
        this.host = host;this.username=username; this.password=password; this.clientId=clientId; this.timeout=timeout;this.keepalive=keepalive;
    }



    public MqttConnectOptions setMqttConnectOptions(String username, String password, int timeout, int keepalive) {
        MqttConnectOptions options = new MqttConnectOptions();
        options.setUserName(username);
        options.setPassword(password.toCharArray());
        options.setConnectionTimeout(timeout);
        options.setKeepAliveInterval(keepalive);
        options.setCleanSession(false);
        return options;
    }

    public void connect() throws MqttException {
        if (client == null) {
            client = new MqttClient(host, clientId, new MemoryPersistence());
        }
        MqttConnectOptions options = setMqttConnectOptions(username, password, timeout, keepalive);
        if (!client.isConnected()) {
            client.connect(options);

//            client.setCallback(new MyMqttCallback(MyMqttClient.this));不要用callback了，有bug 。  直接在订阅时指定listener即可。
        }else{
            client.disconnect();
            client.connect(options);
//          client.setCallback(new MyMqttCallback(MyMqttClient.this)); //哪个沙雕写的callback，害朕找了半天没发现bug在哪里，但就是有bug

        }
        log.info("Mqtt connect success");
    }

    public void publish(String pushMessage, String topic) {
        publish(pushMessage, topic, 0, false);
    }

    /**
     *
     * @param pushMessage 消息体
     * @param topic 主题
     * @param qos 消息等级
     * @param retained 留存
     */
    public void publish(String pushMessage, String topic, int qos, boolean retained) {
        MqttMessage message = new MqttMessage();
        message.setPayload(pushMessage.getBytes());
        message.setQos(qos);
        message.setRetained(retained);
        MqttTopic mqttTopic = MyMqttClient.getClient().getTopic(topic);
        if (null == mqttTopic) {
            log.info("topic is not exist");
        }
        MqttDeliveryToken token;
        synchronized (this) {
            try {
                token = mqttTopic.publish(message);
                token.waitForCompletion(1000L);
            } catch (MqttPersistenceException e) {
                e.printStackTrace();
            } catch (MqttException e) {
                e.printStackTrace();

            }

        }
    }

    //以上是配置好客户端，下来使用
    public static void subscribe(String topic,int qos) {
        try {
            MyMqttClient.getClient().subscribe(topic, qos);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
}

