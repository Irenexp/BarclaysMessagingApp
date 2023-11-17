package com.barclays.controller;

import com.barclays.model.Message;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageControllerTests {

    @Test
    public void testGetAllMessages(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Message[]> response = restTemplate.getForEntity("http://localhost:8080/messages", Message[].class);
        Message[] messages = response.getBody();
        assertEquals(messages.length,1);
    }

    @Test
    public void testGetMessages(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Message> response = restTemplate.getForEntity("http://localhost:8080/messages/1", Message.class);
        Message message = response.getBody();
        assertEquals("Spring is cool: 1 with filter: ", message.getContent());
    }

}
