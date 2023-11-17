package com.barclays.util;

import com.barclays.model.Message;
import com.barclays.repository.MessageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MessagePopulator {

    private MessageRepository messageRepository;

    public void populate(){
        Message m1 = new Message("… Oh, I don't want a lot for Christmas");
        messageRepository.save(m1);

        Message m2 = new Message("This is all I'm asking for");
        messageRepository.save(m2);

        Message m3 = new Message("I just wanna see my baby standing right outside my door");
        messageRepository.save(m3);

        Message m4 = new Message("… Oh, I just want you for my own");
        messageRepository.save(m4);

        Message m5 = new Message("More than you could ever know");
        messageRepository.save(m5);

        Message m6 = new Message("Make my wish come true");
        messageRepository.save(m6);

        Message m7 = new Message("Oh, baby, all I want for Christmas is you");
        messageRepository.save(m7);






    }
}
