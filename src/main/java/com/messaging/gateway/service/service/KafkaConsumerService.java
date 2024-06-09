package com.messaging.gateway.service.service;

import com.messaging.gateway.service.model.request.KafkaProducerRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumerService {

    public void consumerEvent(KafkaProducerRequest KafkaProducerRequest){
        //TODO mongo db insert or set redis cache
        // TODO return event
        log.info("db insert successful");
    }
}
