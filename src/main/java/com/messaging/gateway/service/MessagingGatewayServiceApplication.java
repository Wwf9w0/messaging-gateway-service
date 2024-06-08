package com.messaging.gateway.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableScheduling
@EnableFeignClients
@SpringBootApplication
public class MessagingGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingGatewayServiceApplication.class, args);
	}

}
