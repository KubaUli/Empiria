package com.example.empiria.MedicalInterview;

import com.example.empiria.PersonAddres.PersonAddres;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalInterviewRepository extends CrudRepository<MedicalInterview, Long> {

}
