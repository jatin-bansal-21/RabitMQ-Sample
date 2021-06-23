package com.rabbitmq_publisher.publisher.Service;

import com.rabbitmq_publisher.publisher.RequestPayLoad;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherService implements IPublisherService {
    private static final String TOPIC_EXCHANGE = "topic-exchange";
    private RabbitTemplate rabbitTemplate;

    @Override
    public void publishPayload(RequestPayLoad requestPayLoad) {
        rabbitTemplate.convertAndSend(TOPIC_EXCHANGE, requestPayLoad.getRoutingKey(), requestPayLoad.getMessage());
    }

    @Autowired
    public void setRabbitTemplate(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }
}
