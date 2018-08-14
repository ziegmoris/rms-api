package com.ita3.rmsapi.repository;

import com.ita3.rmsapi.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
    Person findByUsername(String username);
    Person findByUsernameAndPassword(String username, String password);
}
