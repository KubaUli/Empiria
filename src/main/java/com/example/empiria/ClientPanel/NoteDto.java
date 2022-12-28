package com.example.empiria.ClientPanel;

import com.example.empiria.Person.Person;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

public class NoteDto {

    private Long id;
    private String text;
    private LocalDateTime timeAdded;
    private Person person;
}
