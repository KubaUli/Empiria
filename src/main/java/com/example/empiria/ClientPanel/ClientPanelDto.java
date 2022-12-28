package com.example.empiria.ClientPanel;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@Service
public class ClientPanelDto {
    private Long personId;
    private String personName;
    private String personLastName;
    private Integer personPhoneNumber;
    private String personEmail;
    private LocalDate personStartDate;
    private LocalDate personDateOfAccountCreation;
    private String addres;
    private String postCode;
    private String town;



    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public Integer getPersonPhoneNumber() {
        return personPhoneNumber;
    }

    public void setPersonPhoneNumber(Integer personPhoneNumber) {
        this.personPhoneNumber = personPhoneNumber;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public LocalDate getPersonStartDate() {
        return personStartDate;
    }

    public void setPersonStartDate(LocalDate personStartDate) {
        this.personStartDate = personStartDate;
    }

    public LocalDate getPersonDateOfAccountCreation() {
        return personDateOfAccountCreation;
    }


    public void setPersonDateOfAccountCreation(LocalDate personDateOfAccountCreation) {
        this.personDateOfAccountCreation = personDateOfAccountCreation;
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
}
