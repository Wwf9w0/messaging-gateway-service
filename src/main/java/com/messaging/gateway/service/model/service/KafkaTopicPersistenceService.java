package com.messaging.gateway.service.model.service;

import com.messaging.gateway.service.model.entity.KafkaTopicEntity;
import com.messaging.gateway.service.model.repository.KafkaTopicRepository;
import com.messaging.gateway.service.model.request.KafkaCreateTopicRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaTopicPersistenceService {

    private final KafkaTopicRepository kafkaTopicRepository;

    public void saveKafkaTopic(KafkaCreateTopicRequest request) {
        KafkaTopicEntity kafkaTopicEntity = KafkaTopicEntity.builder()
                .userId(request.getUserId())
                .topicName(request.getTopicName())
                .build();
        KafkaTopicEntity save = kafkaTopicRepository.save(kafkaTopicEntity);
        log.info("Kafka topic is created for userId : {}", save.getUserId());
    }

    public List<KafkaTopicEntity> getAllKafkaTopics(){
        return kafkaTopicRepository.findAll();
    }
}
