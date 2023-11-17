package com.barclays.controller;

import com.barclays.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonControllerTests {
    @Test
    public void testGetAllMessages(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Person[]> response = restTemplate.getForEntity("http://localhost:8080/personList", Person[].class);
        Person[] persons = response.getBody();
        assertEquals(persons.length,1);
    }

    @Test
    public void testGetMessages(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Person> response = restTemplate.getForEntity("http://localhost:8080/personList/1", Person.class);
        Person person = response.getBody();
        assertNotNull(person);
        assertEquals("Shurun", person.getName());
        assertEquals("ireneliusr@gmail.com", person.getEmailAddress());
        assertEquals(26, person.getAge());
    }
}
