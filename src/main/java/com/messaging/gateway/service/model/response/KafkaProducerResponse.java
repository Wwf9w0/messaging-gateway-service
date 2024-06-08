package com.messaging.gateway.service.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class KafkaProducerResponse {

    private Integer statusCode;
    private String message;
    private Object object;
}
