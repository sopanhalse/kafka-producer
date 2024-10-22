package com.producer.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class KafkaProducerService {

    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;

    public void producer(String message) {
        CompletableFuture<SendResult<String, Object>> send = kafkaTemplate.send("my-new-topic", message);
        System.out.println(send.isDone());

    }
}
