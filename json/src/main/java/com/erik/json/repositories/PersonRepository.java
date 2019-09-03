package com.erik.json.repositories;

import com.erik.json.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {


}
