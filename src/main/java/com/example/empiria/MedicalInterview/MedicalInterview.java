package com.example.empiria.MedicalInterview;

import com.example.empiria.Person.Person;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class MedicalInterview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@NotNull
    private Boolean consentToProcessingOfPersonalData;
    @NotNull
    private Boolean consentToProcessingPhoneNumber;
    @NotNull
    private Boolean pregnancyOrBreastfeedingQuestion;
    @NotNull
    private Boolean metalImplants;
    @NotNull
    private Boolean autoimmuneDiseases;
    @NotNull
    private Boolean communicableDiseases;
    @NotNull
    private Boolean vascularDiseases;
    @NotNull
    private Boolean diseases;
    @NotNull
    private Boolean skinDiseases;
    @NotNull
    private Boolean fiveMonthsBeforeSkinDiseases;
    @NotNull
    private Boolean fiveMonthsBeforeRetinoid;
    @NotNull
    private Boolean oneMonthsBeforeSolarium;
    @NotNull
    private Boolean twoWeeksBeforefillers;
    @NotNull
    private Boolean tattooHolder;
    @NotNull
    private String OtherDiseases;
    @NotNull
    private String surgicalProceduresFromFiveYearsBefore;
    @NotNull
    private String medicationsTaken;
    @NotNull
    private String supplementsTaken;
    @NotNull
    private String alergiesOwned;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public MedicalInterview() {
    }

    public MedicalInterview( Boolean consentToProcessingOfPersonalData, Boolean consentToProcessingPhoneNumber, Boolean pregnancyOrBreastfeedingQuestion, Boolean metalImplants, Boolean autoimmuneDiseases, Boolean communicableDiseases, Boolean vascularDiseases, Boolean diseases, Boolean skinDiseases, Boolean fiveMonthsBeforeSkinDiseases, Boolean fiveMonthsBeforeRetinoid, Boolean oneMonthsBeforeSolarium, Boolean twoWeeksBeforefillers, Boolean tattooHolder, String otherDiseases, String surgicalProceduresFromFiveYearsBefore, String medicationsTaken, String supplementsTaken, String alergiesOwned, Person person) {


        this.consentToProcessingOfPersonalData = consentToProcessingOfPersonalData;
        this.consentToProcessingPhoneNumber = consentToProcessingPhoneNumber;
        this.pregnancyOrBreastfeedingQuestion = pregnancyOrBreastfeedingQuestion;
        this.metalImplants = metalImplants;
        this.autoimmuneDiseases = autoimmuneDiseases;
        this.communicableDiseases = communicableDiseases;
        this.vascularDiseases = vascularDiseases;
        this.diseases = diseases;
        this.skinDiseases = skinDiseases;
        this.fiveMonthsBeforeSkinDiseases = fiveMonthsBeforeSkinDiseases;
        this.fiveMonthsBeforeRetinoid = fiveMonthsBeforeRetinoid;
        this.oneMonthsBeforeSolarium = oneMonthsBeforeSolarium;
        this.twoWeeksBeforefillers = twoWeeksBeforefillers;
        this.tattooHolder = tattooHolder;
        OtherDiseases = otherDiseases;
        this.surgicalProceduresFromFiveYearsBefore = surgicalProceduresFromFiveYearsBefore;
        this.medicationsTaken = medicationsTaken;
        this.supplementsTaken = supplementsTaken;
        this.alergiesOwned = alergiesOwned;
        this.person = person;
    }


    public Boolean getConsentToProcessingOfPersonalData() {
        return consentToProcessingOfPersonalData;
    }

    public void setConsentToProcessingOfPersonalData(Boolean consentToProcessingOfPersonalData) {
        this.consentToProcessingOfPersonalData = consentToProcessingOfPersonalData;
    }

    public Boolean getConsentToProcessingPhoneNumber() {
        return consentToProcessingPhoneNumber;
    }

    public void setConsentToProcessingPhoneNumber(Boolean consentToProcessingPhoneNumber) {
        this.consentToProcessingPhoneNumber = consentToProcessingPhoneNumber;
    }

    public Boolean getPregnancyOrBreastfeedingQuestion() {
        return pregnancyOrBreastfeedingQuestion;
    }

    public void setPregnancyOrBreastfeedingQuestion(Boolean pregnancyOrBreastfeedingQuestion) {
        this.pregnancyOrBreastfeedingQuestion = pregnancyOrBreastfeedingQuestion;
    }

    public Boolean getMetalImplants() {
        return metalImplants;
    }

    public void setMetalImplants(Boolean metalImplants) {
        this.metalImplants = metalImplants;
    }

    public Boolean getAutoimmuneDiseases() {
        return autoimmuneDiseases;
    }

    public void setAutoimmuneDiseases(Boolean autoimmuneDiseases) {
        this.autoimmuneDiseases = autoimmuneDiseases;
    }

    public Boolean getCommunicableDiseases() {
        return communicableDiseases;
    }

    public void setCommunicableDiseases(Boolean communicableDiseases) {
        this.communicableDiseases = communicableDiseases;
    }

    public Boolean getVascularDiseases() {
        return vascularDiseases;
    }

    public void setVascularDiseases(Boolean vascularDiseases) {
        this.vascularDiseases = vascularDiseases;
    }

    public Boolean getDiseases() {
        return diseases;
    }

    public void setDiseases(Boolean diseases) {
        this.diseases = diseases;
    }

    public Boolean getSkinDiseases() {
        return skinDiseases;
    }

    public void setSkinDiseases(Boolean skinDiseases) {
        this.skinDiseases = skinDiseases;
    }

    public Boolean getFiveMonthsBeforeSkinDiseases() {
        return fiveMonthsBeforeSkinDiseases;
    }

    public void setFiveMonthsBeforeSkinDiseases(Boolean fiveMonthsBeforeSkinDiseases) {
        this.fiveMonthsBeforeSkinDiseases = fiveMonthsBeforeSkinDiseases;
    }

    public Boolean getFiveMonthsBeforeRetinoid() {
        return fiveMonthsBeforeRetinoid;
    }

    public void setFiveMonthsBeforeRetinoid(Boolean fiveMonthsBeforeRetinoid) {
        this.fiveMonthsBeforeRetinoid = fiveMonthsBeforeRetinoid;
    }

    public Boolean getOneMonthsBeforeSolarium() {
        return oneMonthsBeforeSolarium;
    }

    public void setOneMonthsBeforeSolarium(Boolean oneMonthsBeforeSolarium) {
        this.oneMonthsBeforeSolarium = oneMonthsBeforeSolarium;
    }

    public Boolean getTwoWeeksBeforefillers() {
        return twoWeeksBeforefillers;
    }

    public void setTwoWeeksBeforefillers(Boolean twoWeeksBeforefillers) {
        this.twoWeeksBeforefillers = twoWeeksBeforefillers;
    }

    public Boolean getTattooHolder() {
        return tattooHolder;
    }

    public void setTattooHolder(Boolean tattooHolder) {
        this.tattooHolder = tattooHolder;
    }

    public String getOtherDiseases() {
        return OtherDiseases;
    }

    public void setOtherDiseases(String otherDiseases) {
        OtherDiseases = otherDiseases;
    }

    public String getSurgicalProceduresFromFiveYearsBefore() {
        return surgicalProceduresFromFiveYearsBefore;
    }

    public void setSurgicalProceduresFromFiveYearsBefore(String surgicalProceduresFromFiveYearsBefore) {
        this.surgicalProceduresFromFiveYearsBefore = surgicalProceduresFromFiveYearsBefore;
    }

    public String getMedicationsTaken() {
        return medicationsTaken;
    }

    public void setMedicationsTaken(String medicationsTaken) {
        this.medicationsTaken = medicationsTaken;
    }

    public String getSupplementsTaken() {
        return supplementsTaken;
    }

    public void setSupplementsTaken(String supplementsTaken) {
        this.supplementsTaken = supplementsTaken;
    }

    public String getAlergiesOwned() {
        return alergiesOwned;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setAlergiesOwned(String alergiesOwned) {
        this.alergiesOwned = alergiesOwned;
    }
}
