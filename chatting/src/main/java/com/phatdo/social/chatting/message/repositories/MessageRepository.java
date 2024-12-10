package com.phatdo.social.chatting.message.repositories;

import com.phatdo.social.chatting.message.models.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface MessageRepository extends MongoRepository<Message, String>,
        QueryByExampleExecutor<Message> {
}
