package com.example.empiria.MedicalInterview;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MedicalInterviewDto {
    private Boolean consentToProcessingOfPersonalData;
    private Boolean consentToProcessingPhoneNumber;
    private Boolean pregnancyOrBreastfeedingQuestion;
    private Boolean metalImplants;
    private Boolean autoimmuneDiseases;
    private Boolean communicableDiseases;
    private Boolean vascularDiseases;
    private Boolean diseases;
    private Boolean skinDiseases;
    private Boolean fiveMonthsBeforeSkinDiseases;
    private Boolean fiveMonthsBeforeRetinoid;
    private Boolean oneMonthsBeforeSolarium;
    private Boolean twoWeeksBeforefillers;
    private Boolean tattooHolder;
    private String OtherDiseases;
    private String surgicalProceduresFromFiveYearsBefore;
    private String medicationsTaken;
    private String supplementsTaken;
    private String alergiesOwned;

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

    public void setAlergiesOwned(String alergiesOwned) {
        this.alergiesOwned = alergiesOwned;
    }

}

