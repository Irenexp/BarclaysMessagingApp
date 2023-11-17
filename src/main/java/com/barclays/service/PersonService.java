package com.barclays.service;

import com.barclays.model.Person;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person getPerson(@PathVariable int id);

    Person findById(int id);

//    List<Person>findByNameContains(String filter);
//
//    List<Person>findByNameNotContains(String filter);

    List<Person> searchByName(String name);
}
