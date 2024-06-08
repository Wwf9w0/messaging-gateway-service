package com.messaging.gateway.service.controller;


import com.messaging.gateway.service.model.entity.KafkaTopicEntity;
import com.messaging.gateway.service.model.request.KafkaCreateTopicRequest;
import com.messaging.gateway.service.model.request.KafkaProducerRequest;
import com.messaging.gateway.service.service.KafkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class KafkaController {

    private final KafkaService kafkaService;

    @PostMapping
    public ResponseEntity<HttpStatus> produceEvent(@RequestParam String message) {
        kafkaService.send(message);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PostMapping("/create-topic")
    public ResponseEntity<HttpStatus> createTopic(@RequestBody KafkaCreateTopicRequest createTopicRequest) {
        kafkaService.createTopic(createTopicRequest);
        return ResponseEntity.ok(HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<KafkaTopicEntity>> getAllKafkaTopics() {
        return ResponseEntity.ok(kafkaService.getAllKafkaTopics());
    }


    @PostMapping("/produce-data")
    public ResponseEntity<HttpStatus> produceData(@RequestBody KafkaProducerRequest kafkaProducerRequest){
        kafkaService.produceObject(kafkaProducerRequest);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
