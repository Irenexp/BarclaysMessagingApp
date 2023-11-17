package com.barclays.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Person {


    @Id
    @GeneratedValue
    private int id;

    private String name;

    public Person(Integer id, Integer age, String emailAddress, String name){
        this.name = name;
        this.emailAddress = emailAddress;
        this.age=age;
        this.id=id;
    }

    public Person(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    @OneToOne(cascade = CascadeType.PERSIST)
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String emailAddress;

    private int age;

}
