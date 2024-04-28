package com.test.chat;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class TestWebSocketHandler extends TextWebSocketHandler {

    private static final Map<Long, List<WebSocketSession>> sessions = new HashMap<>();

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) {
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
    }
}
