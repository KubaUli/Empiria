package com.example.empiria.MedicalInterview;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalInterviewRepository extends CrudRepository<MedicalInterview, Long> {

}
