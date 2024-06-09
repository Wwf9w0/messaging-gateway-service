package com.messaging.gateway.service.service;

import com.messaging.gateway.service.model.request.KafkaProducerRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaMongoService {

    public void saveEventOnMongo(KafkaProducerRequest request){
        //TODO mongo save the produce event
        //TODO return data id

    }

    public List<String> returnDataFromMongo(){
        //TODO return data from mongo
        return null;
    }
}
