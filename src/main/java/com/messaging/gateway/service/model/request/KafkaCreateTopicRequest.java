package com.messaging.gateway.service.model.request;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class KafkaCreateTopicRequest {

    private Long userId;
    private String topicName;
}
