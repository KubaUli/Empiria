package com.example.empiria.Person.PersonAddres;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonAddresRepository extends CrudRepository<PersonAddres, Long> {

    List<PersonAddres> findByPerson(long id);
}
