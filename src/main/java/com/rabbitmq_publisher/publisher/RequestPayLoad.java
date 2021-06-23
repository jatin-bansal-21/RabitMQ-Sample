package com.rabbitmq_publisher.publisher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestPayLoad {
    private Integer requestId;
    private String message;
    private String routingKey;
}
