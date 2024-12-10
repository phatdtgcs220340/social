package com.phatdo.social.chatting.message.models;

import com.phatdo.social.chatting.box.models.BoxChat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(collection = "messages")
@Data
public class Message {
    @Id
    private String id;
    private final String userId;
    private String content;
    @DBRef
    private final BoxChat box;
    private Instant dateAudited;
}
