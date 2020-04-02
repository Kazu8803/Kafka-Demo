package com.kafka.demo.controller;

import com.kafka.demo.entity.JsonDTO;
import com.kafka.demo.producer.JsonProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

    @Autowired
    private JsonProducer jsonProducer;

    @PostMapping("/json")
    public String producerJsonMessage(@RequestBody JsonDTO json){
        jsonProducer.sendJson(json);
        return "JSON sended to Kafka";
    }
}
