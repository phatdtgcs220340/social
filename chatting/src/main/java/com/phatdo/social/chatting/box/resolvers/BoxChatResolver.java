package com.phatdo.social.chatting.box.resolvers;

import com.phatdo.social.chatting.box.models.BoxChat;
import com.phatdo.social.chatting.box.repositories.BoxChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BoxChatResolver {
    private final BoxChatRepository repository;

    @Autowired
    public BoxChatResolver(BoxChatRepository repository) {
        this.repository = repository;
    }

    public BoxChat addBox(BoxChat input) {
        return repository.save(input);
    }

    public List<BoxChat> findAllByExample(BoxChat example) {
        Example<BoxChat> boxChatExample = Example.of(example);
        return repository.findAll(boxChatExample);
    }

    public List<BoxChat> findAll() {
        return repository.findAll();
    }
}
