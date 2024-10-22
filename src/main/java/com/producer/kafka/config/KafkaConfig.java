package com.producer.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class KafkaConfig {

    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;

    @Bean
    public NewTopic createNewTopic() {
        return new NewTopic("my-new-topic", 4, (short) 1); // Topic name, number of partitions, replication factor
    }
}
