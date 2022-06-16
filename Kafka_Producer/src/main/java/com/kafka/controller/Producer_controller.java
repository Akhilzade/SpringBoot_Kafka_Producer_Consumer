package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("p1")
public class Producer_controller  {

        @Autowired
        KafkaTemplate<String, String>
                kafkaTemplate;

        static final String TOPIC = "testProducer";

        // Implementing a GET method
        @GetMapping("publish/{message}")
        public void publish_message(
                @PathVariable("message") String message)
        {
            while (true){
                kafkaTemplate.send(TOPIC, message);
            }
//            kafkaTemplate.send(TOPIC, message);
//            return "Message Published on Kafka !";
        }

}
