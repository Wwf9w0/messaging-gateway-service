package com.messaging.gateway.service.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table(name = "kafkatopic")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KafkaTopicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private Long userId;

    @Column()
    private String topicName;
}
