package com.kafka.demo.consumer;

import com.kafka.demo.entity.JsonDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class JsonConsumer {

    @KafkaListener(topics = "${json.topic.name}")
    public void receiveJson(@Payload JsonDTO json, @Headers MessageHeaders headers){
        log.info("received data={}", json);
        headers.keySet().forEach(key -> {
            log.info("{} :  {}", key, headers.get(key));
        });
    }

}
