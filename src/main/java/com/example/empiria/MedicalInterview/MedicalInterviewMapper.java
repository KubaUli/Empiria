package com.example.empiria.MedicalInterview;

import com.example.empiria.Person.PersonService;
import org.springframework.stereotype.Service;

@Service
public class MedicalInterviewMapper {

    public MedicalInterview map(MedicalInterviewDto medicalInterviewDto){
        MedicalInterview medicalInterview= new MedicalInterview();
        medicalInterview.setConsentToProcessingOfPersonalData(medicalInterviewDto.getConsentToProcessingOfPersonalData());
        medicalInterview.setConsentToProcessingPhoneNumber(medicalInterviewDto.getConsentToProcessingPhoneNumber());
        medicalInterview.setPregnancyOrBreastfeedingQuestion(medicalInterviewDto.getPregnancyOrBreastfeedingQuestion());
        medicalInterview.setMetalImplants(medicalInterviewDto.getMetalImplants());
        medicalInterview.setAutoimmuneDiseases(medicalInterviewDto.getAutoimmuneDiseases());
        medicalInterview.setCommunicableDiseases(medicalInterviewDto.getCommunicableDiseases());
        medicalInterview.setVascularDiseases(medicalInterviewDto.getVascularDiseases());
        medicalInterview.setFiveMonthsBeforeSkinDiseases(medicalInterviewDto.getFiveMonthsBeforeSkinDiseases());
        medicalInterview.setFiveMonthsBeforeRetinoid(medicalInterviewDto.getFiveMonthsBeforeRetinoid());
        medicalInterview.setOneMonthsBeforeSolarium(medicalInterviewDto.getOneMonthsBeforeSolarium());
        medicalInterview.setTwoWeeksBeforefillers(medicalInterviewDto.getTwoWeeksBeforefillers());
        medicalInterview.setTattooHolder(medicalInterviewDto.getTattooHolder());
        medicalInterview.setOtherDiseases(medicalInterviewDto.getOtherDiseases());
        medicalInterview.setSurgicalProceduresFromFiveYearsBefore(medicalInterviewDto.getSurgicalProceduresFromFiveYearsBefore());
        medicalInterview.setMedicationsTaken(medicalInterviewDto.getMedicationsTaken());
        medicalInterview.setSupplementsTaken(medicalInterviewDto.getSupplementsTaken());
        medicalInterview.setAlergiesOwned(medicalInterviewDto.getAlergiesOwned());

        medicalInterview.setPerson(PersonService.persontransfer);
        return medicalInterview;
    }

}
