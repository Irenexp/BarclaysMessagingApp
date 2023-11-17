package com.barclays.service;

import com.barclays.model.Person;
import com.barclays.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    @Override
    public List<Person> findAll(){
        List<Person> personList = new ArrayList<>();
        Iterable<Person> personIterable = personRepository.findAll();
        personIterable.forEach((personList::add));
        return personList;
    }

    @Override
    public Person getPerson(@PathVariable int id) {
        Person person= new Person();
        person.setName("Shurun");
        person.setAge(26);
        person.setEmailAddress("ireneliusr@gmail.com");
        return person;
    }

    @Override
    public Person findById(int id){
        Optional<Person> person = personRepository.findById(id);
        return person.orElseGet(() -> new Person(0,0,"no such person", "null"));
    }

//    @Override
//    public List<Person>findByNameContains(String filter){
//        return personRepository.findByNameContainsIgnoreCase(filter);
//    }
//
//    @Override
//    public List<Person>findByNameNotContains(String filter){
//        return personRepository.findByNameNotContains(filter);
//    }

    @Override
    public List<Person> searchByName(String name) {
        return personRepository.searchByName(name);
    }

}
