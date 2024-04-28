package com.test.chat.controller;

import com.test.chat.domain.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MessageController {

    private final SimpMessageSendingOperations messagingTemplate;

    @MessageMapping("/message")
    public void message(Message message) {
        messagingTemplate.convertAndSend("/sub/channel/" + message.getChannelNum(), message);
    }
}
