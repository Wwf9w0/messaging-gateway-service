package com.messaging.gateway.service.service;

import com.messaging.gateway.service.configuration.properties.KafkaProperties;
import com.messaging.gateway.service.model.request.KafkaProducerRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducerService {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private final KafkaProperties kafkaProperties;

    public void producerService(KafkaProducerRequest request){
        kafkaTemplate.send(kafkaProperties.getTopic().getX(), request);
    }
}
