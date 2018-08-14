package com.ita3.rmsapi.controller;

import com.ita3.rmsapi.model.Person;
import com.ita3.rmsapi.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    private final PersonRepository personRepository;
    private static final Logger log = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping(value = "/getPersonByUsername")
    @CrossOrigin("*")
    public Person getPersonByUsername(@RequestParam(value="username", defaultValue="ADMIN") String username){
        Person person = personRepository.findByUsername(username);
        log.info(person.toString());
        return person;
    }

    @GetMapping(value = "/getPersonByLoginDetails")
    @CrossOrigin("*")
    public Person getPersonByUsername(@RequestParam(value="username", defaultValue="ADMIN") String username,
                                      @RequestParam(value="password", defaultValue="ADMIN123") String password){
        Person person = personRepository.findByUsernameAndPassword(username, password);
        log.info(person.toString());
        return person;
    }

    @GetMapping(value = "/getAllPersons")
    @CrossOrigin("*")
    public Iterable<Person> getAllPersons(){
        return personRepository.findAll();
    }
}
