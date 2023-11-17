package com.barclays.controller;

import com.barclays.model.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Sql("classpath:test-data.sql")
@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@TestPropertySource(properties = {"spring.sql.init.mode=never"})
public class MessageControllerIntegrationTests {


    @Autowired
    MessageController messageController;

//    @Test
//    public void testGetAllMessages(){
//        String filter;
//        List<Message> messageList = messageController.getAllMessages(filter);
//        assertEquals(4, messageList.size());
//
//    }

    @Test
    public void testGetMessage(){
        Message message = messageController.getMessage(1);
        assertEquals("Spring is cool: 1", message.getContent());
    }
}
