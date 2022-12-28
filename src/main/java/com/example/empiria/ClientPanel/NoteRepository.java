package com.example.empiria.ClientPanel;

import com.example.empiria.Person.PersonAddres.PersonAddres;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends CrudRepository<Note,Long> {


}


