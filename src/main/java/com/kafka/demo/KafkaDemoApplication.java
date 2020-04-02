package com.kafka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.schema.client.EnableSchemaRegistryClient;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
@EnableBinding(Processor.class)
@EnableSchemaRegistryClient
public class KafkaDemoApplication {

    public static void main(String... args) {
        SpringApplication.run(KafkaDemoApplication.class, args);
    }

}
