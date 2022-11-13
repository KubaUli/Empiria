package com.example.empiria.PersonAddres;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonAddresRepository extends CrudRepository<PersonAddres, Long> {

}
