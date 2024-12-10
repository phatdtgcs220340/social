package com.phatdo.social.chatting.box.controllers;

import com.phatdo.social.chatting.box.models.BoxChat;
import com.phatdo.social.chatting.box.resolvers.BoxChatResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@SchemaMapping(typeName = "BoxChat")
public class BoxChatController {
    private final BoxChatResolver resolver;

    @Autowired
    public BoxChatController(BoxChatResolver resolver) {
        this.resolver = resolver;
    }

    @QueryMapping
    public List<BoxChat> findAllBoxChatsByExample(@Argument("example") BoxChat example) {
        return resolver.findAllByExample(example);
    }

    @MutationMapping
    public BoxChat addBoxChat(@Argument("input") BoxChat input) {
        return resolver.addBox(input);
    }

    @QueryMapping
    public List<BoxChat> findAllBoxChats() {
        return resolver.findAll();
    }
}
