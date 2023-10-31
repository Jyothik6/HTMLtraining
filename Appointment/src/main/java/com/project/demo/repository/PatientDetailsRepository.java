package com.project.demo.repository;

import com.project.demo.entities.Doctor;
import com.project.demo.entities.Patient;
import com.project.demo.entities.PatientDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientDetailsRepository extends JpaRepository<PatientDetails, Long> {
    List<PatientDetails> findByDoctor(Doctor doctor);
    
    List<PatientDetails> findByPatientId(Long patientId);
}
