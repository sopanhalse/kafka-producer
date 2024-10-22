package com.producer.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "my-new-topic", groupId = "new-group")
    public void consumer(String message) {
        System.out.println("consumed message : " + message);

    }
}
