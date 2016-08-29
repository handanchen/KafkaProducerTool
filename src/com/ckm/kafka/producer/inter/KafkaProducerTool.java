package com.ckm.kafka.producer.inter;

import java.util.Properties;

/**
 * Created by ckm on 2016/8/25.
 */
public interface KafkaProducerTool {
    /**
     * ������Ϣ��ָ��topic
     * @param topic
     * @param message
     */
    void publishMessage(String topic, String message);

    /**
     * ������Ϣ��
     * ʹ��kafkaconfig.properties�����õ�app.topic������
     * ����ò���Ϊ���ã���Ĭ��topic="default-topic"
     * @param message
     */
    void publishMessage(String message);

    /**
     * ������Ϣ��ָ��topic��ָ������key��ָ����Ϣ����
     * @param topic
     * @param partitionKey
     * @param message
     */
    void publishPartitionedMessage(String topic, String partitionKey, String message);

    /**
     * ������Ϣ��ָ������key��ָ����Ϣ����
     * ʹ��kafkaconfig.properties�����õ�app.topic������
     * ����ò���Ϊ���ã���Ĭ��topic="default-topic"
     * @param partitionKey
     * @param message
     */
    void publishPartitionedMessage(String partitionKey, String message);

    /**
     * ����Producer�Ĳ�������
     * @param producerProperties
     */
    void setProducerProperties(Properties producerProperties);

    public Properties getProducerProperties();

    /**
     * ���ö�ȡ�����ļ��Ĳ�������
     * @param configProperties
     */
    void setConfigProperties(Properties configProperties);

    public Properties getConfigProperties();
}
