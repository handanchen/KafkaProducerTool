�����Ŀ��Kafka��producer���з�װ��ʹ��Producer��ʹ���ܹ���򵥻���


�������ò�����д��kafkaconfig.properties�ļ��У�������Ҫ��Ϊ���֣�
1���û��Զ������
���������Ҫ��"app."��ͷ��
����ָ��topic��app.tipic=test-topic

2��Kafka Producer����
�����������kafka producer�Ĳ�����������key��value�������kafka�Ĺ淶��
����������Բο��ٷ��ĵ���http://kafka.apache.org/documentation.html#producerconfigs

ʹ��ʾ����
1����򵥵ĵ���
KafkaProducerTool kafkaProducerTool = new KafkaProducerToolImpl();
kafkaProducerTool.publishMessage("test message");
�����д��룬�ͻὫ"test message"��kafkaconfig.properties�ļ��е�����д���Ӧ��broker��topic��

2�������������ʱ�޸�һЩProducer������
KafkaProducerTool kafkaProducerTool = new KafkaProducerToolImpl();
Properties producerProperties = kafkaProducerTool.getProducerProperties();
producerProperties.put("xx", "yy");
kafkaProducerTool.publishMessage("test message");

3���Զ���Parititioner��Producer
�����ְ취a��b��
(a)��kafkaconfig.properties������һ�����ò���partitioner.class=com.xx.yy.TestPartitioner
(b)ʹ��2�еķ�������ȡproducerProperties
Properties producerProperties = kafkaProducerTool.getProducerProperties();
producerProperties.put("partitioner.class", "SimplePartitioner");


ͬʱ��Ҳ�������Լ�����Ŀ��ʹ���Զ���������ļ�����һ��Properties���͵�configProperties����Ȼ��set��KafkaProducerTool�С�
Ҳ�ɻ���KafkaProducerTool�ӿڣ������Լ���ProducerTool�ࡣ

����ʹ�÷�����������һ��������������