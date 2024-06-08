package com.messaging.gateway.service.model.repository;

import com.messaging.gateway.service.model.entity.KafkaTopicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KafkaTopicRepository extends JpaRepository<KafkaTopicEntity, Long> {
}
