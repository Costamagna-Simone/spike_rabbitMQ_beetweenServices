package com.rabbitSpike.receiver;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component
public class BallDataConsumer {

    public void receiveMessage(String data) {
        System.out.println("Messaggio ricevuto: ");
        System.out.println(data);
    }
}