package com.wagnerww.websocket.distributed_websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.wagnerww.websocket.distributed_websocket.models.ForumMessage;

@Controller
public class ForumController {

    @MessageMapping("/forum")
    @SendTo("/topic/messages")
    public void sendMessage(String forumMessage) {
        System.out.println("Received message: " + forumMessage);
    }
    
}
