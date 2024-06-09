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

    private final KafkaConsumerService consumerService;

    private final KafkaProducerService kafkaProducerService;


    @KafkaListener(topics = "x", groupId = "group-2")
    public void consumer(KafkaProducerRequest producerRequest){
        log.info(" event : {}", producerRequest);
        consumerService.consumerEvent(producerRequest);
    }

    public void send(String message){
        kafkaTemplate.send(kafkaProperties.getTopic().getX(), message);
    }

    public void produceObject(KafkaProducerRequest kafkaProducerRequest) {
        kafkaProducerService.producerService(kafkaProducerRequest);
        //TODO filter event for user in the kafka event list
        // return the event list for user
    }

    public void createTopic(KafkaCreateTopicRequest createTopicRequest) {
    }

    public List<KafkaTopicEntity> getAllKafkaTopics() {
        return Collections.emptyList();
    }
}
