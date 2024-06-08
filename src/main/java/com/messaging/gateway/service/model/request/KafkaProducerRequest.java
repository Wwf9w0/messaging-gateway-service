package com.messaging.gateway.service.model.request;


import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Builder
public class KafkaProducerRequest {

    List<Map<String, Object>> objectList;
}
