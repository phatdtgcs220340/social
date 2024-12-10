package com.phatdo.social.chatting.box.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Document(collection = "box-chats")
@Data
public class BoxChat {
    @Id
    private String id;
    private String name;
    private Set<String> participants = new HashSet<>();
    private Instant dateAudited;
}
