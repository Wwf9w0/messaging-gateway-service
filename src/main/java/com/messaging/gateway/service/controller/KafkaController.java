package com.messaging.gateway.service.controller;


import com.messaging.gateway.service.service.KafkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class KafkaController {

    private final KafkaService kafkaService;

    @PostMapping
    public ResponseEntity<HttpStatus> produceEvent(@RequestParam String message){
        kafkaService.send(message);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
