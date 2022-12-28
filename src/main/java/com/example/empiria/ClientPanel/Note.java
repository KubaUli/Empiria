package com.example.empiria.ClientPanel;

import com.example.empiria.Person.Person;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private LocalDateTime timeAdded;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Note(String text ) {
        this.text = text;
        this.timeAdded = LocalDateTime.now();
    }

    public Note() {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTimeAdded() {
        return timeAdded;
    }
}
