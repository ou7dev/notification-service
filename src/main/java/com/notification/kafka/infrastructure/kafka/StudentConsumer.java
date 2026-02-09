package com.notification.kafka.infrastructure.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class StudentConsumer {

    @KafkaListener(topics = "student-topic", groupId = "student-group")
    public void consume(String student) {
        System.out.println("Received message: " + student);
    }

}