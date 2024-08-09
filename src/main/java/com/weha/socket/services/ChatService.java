package com.weha.socket.services;

import com.weha.socket.dtos.MessageRequest;
import com.weha.socket.dtos.MessageResponse;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;


@Service
public class ChatService {
    private static final String DESTINATION = "/topic/chat";

    private final SimpMessagingTemplate template;

    public ChatService(SimpMessagingTemplate template) {
        this.template = template;
    }

    public String chat(MessageRequest request) {
        MessageResponse response = new MessageResponse();
        response.setMessage(request.getMessage());
        template.convertAndSend(DESTINATION, response);
        return "Send successfully";
    }
}
