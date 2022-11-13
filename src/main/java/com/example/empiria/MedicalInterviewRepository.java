package com.example.empiria;

import com.example.empiria.MedicalInterview.MedicalInterview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalInterviewRepository extends CrudRepository<MedicalInterview,Long> {
}
