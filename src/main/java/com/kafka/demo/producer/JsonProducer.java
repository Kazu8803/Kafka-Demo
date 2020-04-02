package com.kafka.demo.producer;

import com.kafka.demo.entity.JsonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.Message;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class JsonProducer {

    @Autowired
    private KafkaTemplate<String, JsonDTO> kafkaTemplate;

    @Value("${json.topic.name}")
    private String topic;

    public void sendJson(JsonDTO json){
        Message<JsonDTO> message = MessageBuilder.withPayload(json)
                .setHeader(KafkaHeaders.TOPIC, topic)
                .build();
        kafkaTemplate.send(message);
        log.info("Send message json {}", json);
    }


}
