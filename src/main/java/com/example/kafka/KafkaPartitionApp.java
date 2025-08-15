package com.example.kafka;

import com.example.kafka.producer.MyKafkaProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaPartitionApp implements CommandLineRunner {

    private final MyKafkaProducer producer;

    public KafkaPartitionApp(MyKafkaProducer producer) {
        this.producer = producer;
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaPartitionApp.class, args);
    }

    @Override
    public void run(String... args) {
        // Send a message to partition 1 on startup
        producer.sendToPartition(1, "customKey", "Hello Partition 1 from Spring Kafka!");
    }
}
