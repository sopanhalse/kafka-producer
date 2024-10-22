package com.producer.kafka.controller;

import com.producer.kafka.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/producer/{message}")
    public ResponseEntity<?> producer(@PathVariable("message") String message) {
        kafkaProducerService.producer(message);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
