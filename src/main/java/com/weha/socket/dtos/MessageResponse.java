package com.weha.socket.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageResponse {
    private String message;
    private final LocalDateTime created;

    public MessageResponse() {
        created = LocalDateTime.now();
    }
}
