package com.rabbitmq_consumer1.consumer1;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @RabbitListener(queues = "cool-queue")
    public void consumeCoolMessage(String message) {
        System.out.println("Cool Message: " + message);
    }

    @RabbitListener(queues = "cooler-queue")
    public void consumeCoolerMessage(String message) {
        System.out.println("The cooler message: " + message);
    }
}
