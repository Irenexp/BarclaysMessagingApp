package com.barclays.controller;

import com.barclays.model.Person;
import com.barclays.model.Message;
import com.barclays.service.PersonService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@Slf4j
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService){this.personService = personService;}

//    @GetMapping("/personList")
//    public List<Person> getAllPersonList(@PathParam("filter")String filter,@PathParam("not") String not){
//        List<Person>personList = Collections.emptyList();
//            if(StringUtils.isNotBlank(filter)){
//                personList = personService.findByNameContains(filter);
//            }
//            else if(StringUtils.isNotBlank(not)){
//                log.debug("Called not filter");
//                personList = personService.findByNameNotContains(not);
//            } else{
//                log.debug("Called filter");
//                personList=personService.findAll();
//            }
//            return personList;
////        log.debug("In the get All PersonList method");
////        return personService.findAll();
//    }

    @GetMapping("/personList/{id}")
    public Person getPerson(@PathVariable int id) {
        return personService.getPerson(1);
    }

    @GetMapping("/person/search")
    public List<Person>searchByName(@PathParam("name") String name) {
        return personService.searchByName(name);
    }
}
