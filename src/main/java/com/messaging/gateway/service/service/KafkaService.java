package com.messaging.gateway.service.service;

import com.messaging.gateway.service.configuration.properties.KafkaProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaService {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private final KafkaProperties kafkaProperties;


    @KafkaListener(topics = "x", groupId = "group-1")
    public void consumer(String message){
        log.info(message);
    }

    public void send(String message){
        kafkaTemplate.send(kafkaProperties.getTopic().getX(), message);
    }
}
