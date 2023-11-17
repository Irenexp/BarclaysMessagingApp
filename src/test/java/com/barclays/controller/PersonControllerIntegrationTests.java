package com.barclays.controller;

import com.barclays.model.Message;
import com.barclays.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
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
public class PersonControllerIntegrationTests {
    @Autowired
    PersonController personController;

//    @Test
//    public void testGetAllPersonList(){
//        List<Person> personList = personController.getAllPersonList();
//        assertEquals(4, personList.size());
//
//    }

    @Test
    public void testGetPerson(){
        Person person = personController.getPerson(1);
        assertEquals("Shurun", person.getName());
    }
}
