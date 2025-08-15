package com.example.kafka.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyKafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public MyKafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendToPartition(int partition, String key, String value) {
        kafkaTemplate.send("my-topic", partition, key, value);
        System.out.printf("✅ Sent to partition %d: key=%s, value=%s%n", partition, key, value);
    }
}
