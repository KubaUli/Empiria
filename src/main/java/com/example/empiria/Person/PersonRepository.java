package com.example.empiria.Person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person>findByName(String name);
    List<Person>findByLastName(String lastName);
    List<Person>findByStartDate(LocalDate startDate);
    List<Person>findByEmail(String email);
    List<Person>findByPhoneNumber(Integer phoneNumber);



}
