package com.example.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MyKafkaConsumer {

    @KafkaListener(topicPartitions = @org.springframework.kafka.annotation.TopicPartition(
            topic = "my-topic",
            partitions = {"1"} // Only partition 1
    ), groupId = "partition-reader")
    public void listenPartitionOne(String message) {
        System.out.println("📥 Received from partition 1: " + message);
    }
}
