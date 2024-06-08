package com.messaging.gateway.service.configuration.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "kafka")
public class KafkaProperties {

    private String address;
    private Topic topic;
    private String groupId;
    private Integer concurrencyCount;
    @Getter
    @Setter
    public static class Topic {

        private String x;
        private String y;
        private String z;
    }
}
