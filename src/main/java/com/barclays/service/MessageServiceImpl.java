package com.barclays.service;

import com.barclays.model.Message;
import com.barclays.repository.MessageRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

//    public MessageServiceImpl(MessageRepository messageRepository){
//        this.messageRepository=messageRepository;
//    }
    @Override
    public List<Message> findAll(){
        List<Message> messages = new ArrayList<>();
        Iterable<Message> messagesIts = messageRepository.findAll();
        messagesIts.forEach((messages::add));
        return messages;
    }

    @Override
    public Message findById(int id){
        Optional<Message> message = messageRepository.findById(id);
        return message.orElseGet(() -> new Message("Default Message: Nothing Found"));
    }

    @Override
    public List<Message>findByContentContains(String filter){
        return messageRepository.findByContentContains(filter);
    }

}
