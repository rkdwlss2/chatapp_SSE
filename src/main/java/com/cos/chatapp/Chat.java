package com.cos.chatapp;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

//STS 툴에 lombok 설정하는법(인터넷)

@Data
@Document(collection = "chat")
public class Chat {

    @Id
    private String id;
    private String msg;
    private String sender; // 보내는 사람
    private String receiver; // 받는 사람

    private LocalDateTime createdAt;

}
