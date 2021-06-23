package com.rabbitmq_publisher.publisher.Service;

import com.rabbitmq_publisher.publisher.RequestPayLoad;

public interface IPublisherService {
    void publishPayload(RequestPayLoad requestPayLoad);
}
