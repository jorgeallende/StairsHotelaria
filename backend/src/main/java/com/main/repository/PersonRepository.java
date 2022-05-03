package com.main.repository;
import com.main.models.Person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person,Long>{
    public Person findByEmail(String email);
}
