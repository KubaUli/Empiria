package com.example.empiria.PersonAddres;

import com.example.empiria.Person.Person;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class PersonAddres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String addres;
    @NotNull
    @Size(min = 5, max = 6)
    private String postCode;

    private String town;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public PersonAddres() {
    }

    public PersonAddres(String addres, String postCode, String town, Person person) {
        this.addres = addres;
        this.postCode = postCode;
        this.town = town;
        this.person = person;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
