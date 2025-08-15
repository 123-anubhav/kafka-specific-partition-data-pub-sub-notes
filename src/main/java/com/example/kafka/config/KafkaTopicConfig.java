package com.example.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic createTopic() {
        // topic name: my-topic, partitions: 3, replication factor: 1
        return new NewTopic("my-topic", 3, (short) 1);
    }
}
