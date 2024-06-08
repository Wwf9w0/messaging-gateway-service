package com.messaging.gateway.service.model.event;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Builder
public class KafkaProducerEvent {

    private String userId;
    List<Map<String, Object>> object;
}
