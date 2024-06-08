package com.messaging.gateway.service.service;

import com.messaging.gateway.service.configuration.properties.KafkaProperties;
import com.messaging.gateway.service.model.entity.KafkaTopicEntity;
import com.messaging.gateway.service.model.request.KafkaCreateTopicRequest;
import com.messaging.gateway.service.model.request.KafkaProducerRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

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

    public void produceObject(KafkaProducerRequest kafkaProducerRequest) {
        kafkaTemplate.send(kafkaProperties.getTopic().getX(), kafkaProducerRequest);
    }

    public void createTopic(KafkaCreateTopicRequest createTopicRequest) {
    }

    public List<KafkaTopicEntity> getAllKafkaTopics() {
        return Collections.emptyList();
    }
}
