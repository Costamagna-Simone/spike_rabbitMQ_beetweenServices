package com.rabbitSpike.sender;

import com.google.gson.Gson;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class BallController {
    @Autowired
    private Queue ballQueue;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping(value = "/ball/test")
    public ResponseEntity test(@RequestBody Ball ball) {
        System.out.println("Chiamata POST ricevuta");

        rabbitTemplate.convertAndSend(ballQueue.getName(), ball.getColor() + " " + ball.getSize());

        System.out.println("Messaggio inviato");

        return ResponseEntity.noContent().build();
    }
}