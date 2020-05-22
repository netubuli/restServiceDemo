package com.example.restServiceDemo;


import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository

@Transactional
public class CreatePerson {

    @PersistenceContext
    private EntityManager entityManager;
    public String CreateUser(String name, String lastName, String city){
        Person person = new Person();
        person.setFirstName(name);
        person.setLastName(lastName);
        person.setCity(city);

        entityManager.persist(person);

        return person.toString();
    }
}
