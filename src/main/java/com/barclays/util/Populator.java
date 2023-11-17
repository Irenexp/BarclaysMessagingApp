package com.barclays.util;

import com.barclays.model.Address;
import com.barclays.model.Person;
import com.barclays.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Populator {

    private PersonRepository personRepository;

    @EventListener(ContextRefreshedEvent.class)
    public void populatePerson(){
        Person p1 = new Person(1, 2,"xiang@gmail.com", "Xiang");
        personRepository.save(p1);
        Person p2 = new Person(2,1, "pang@gmail.com", "Pang");
        personRepository.save(p2);
        Person p3 = new Person(3,26, "shurun@gmail.com", "Shurun");
        personRepository.save(p3);
        Person p4 = new Person(4,1, "clara@gmail.com", "Clara");
        personRepository.save(p4);
    }

    public void populateAddress(){
        Person person = new Person();
        person.setName("Barclays");
        person.setEmailAddress("barclays@gmail.com");

        Address address = new Address();
        address.setLineOne("3rd floor");
        address.setLineTwo("WindmillCroft");
        address.setState("Glasgow");
        address.setPostalCode("G4");
        address.setCountry("UK");

        person.setAddress(address);

        personRepository.save(person);

        Person person2 = new Person();
        person2.setName("Steve");
        person2.setEmailAddress("steve@gmail.com");

        personRepository.save(person2);

    }
}