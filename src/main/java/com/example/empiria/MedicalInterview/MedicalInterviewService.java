package com.example.empiria.MedicalInterview;

import org.springframework.stereotype.Service;

@Service
public class MedicalInterviewService {
    private final MedicalInterviewRepository medicalInterviewRepository;
    private final MedicalInterviewMapper medicalInterviewMapper;


    public MedicalInterviewService(MedicalInterviewRepository medicalInterviewRepository, MedicalInterviewMapper medicalInterviewMapper) {
        this.medicalInterviewRepository = medicalInterviewRepository;
        this.medicalInterviewMapper = medicalInterviewMapper;
    }



    public void registerInterview(MedicalInterviewDto medicalInterviewDto) {
            MedicalInterview medicalInterview = medicalInterviewMapper.map(medicalInterviewDto);
            medicalInterviewRepository.save(medicalInterview);

        }
    }



