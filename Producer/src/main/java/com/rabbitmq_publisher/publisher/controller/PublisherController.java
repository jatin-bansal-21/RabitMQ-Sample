package com.rabbitmq_publisher.publisher.controller;

import com.rabbitmq_publisher.publisher.RequestPayLoad;
import com.rabbitmq_publisher.publisher.Service.IPublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "/publish")
@Controller
public class PublisherController {
    private IPublisherService publisherService;

    @PostMapping(value = "/sendPayload", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void publishMessage(@RequestBody RequestPayLoad requestPayLoad) {
        publisherService.publishPayload(requestPayLoad);
    }

    @GetMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @Autowired
    public void setPublisherService(IPublisherService publisherService) {
        this.publisherService = publisherService;
    }
}
