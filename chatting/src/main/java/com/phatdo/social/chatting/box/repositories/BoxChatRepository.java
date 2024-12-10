package com.phatdo.social.chatting.box.repositories;

import com.phatdo.social.chatting.box.models.BoxChat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface BoxChatRepository extends MongoRepository<BoxChat, String>,
        QueryByExampleExecutor<BoxChat> {
}
