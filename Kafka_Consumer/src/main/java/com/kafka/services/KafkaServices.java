package com.kafka.services;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaServices {

        @KafkaListener(topics = "testProducer",
                groupId = "kafkaUser")
        public void publish(String message)
        {
            System.out.println("You have a new message: "+ message);
        }

}
