# Spring Kafka Partition Demo

This sample shows how to:
- Create a topic with 3 partitions using Spring's `NewTopic` bean
- Send to a specific partition via `KafkaTemplate.send(topic, partition, key, value)`
- Read only from a specific partition using `@KafkaListener(topicPartitions=...)`

## Prerequisites
- Java 17
- Maven 3.8+
- Kafka running locally on `localhost:9092`

## Run
```bash
mvn spring-boot:run
```

On startup, the app sends one message to **partition 1** and the consumer listens only to **partition 1**.
