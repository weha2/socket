package com.weha.socket.controllers;

import com.weha.socket.dtos.MessageRequest;
import com.weha.socket.services.ChatService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
@Tag(name = "Chat", description = "APIs for chat")
public class ChatController {

    private final ChatService service;

    public ChatController(ChatService service) {
        this.service = service;
    }

    @PostMapping("")
    public ResponseEntity<String> chat(@RequestBody MessageRequest request) {
        return ResponseEntity.ok(service.chat(request));
    }
}
