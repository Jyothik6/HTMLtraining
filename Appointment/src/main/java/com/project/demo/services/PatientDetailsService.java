package com.project.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.entities.PatientDetails;
import com.project.demo.repository.PatientDetailsRepository;

@Service
public class PatientDetailsService {
    @Autowired
    private PatientDetailsRepository patientDetailsRepository;

  
    public List<PatientDetails> findPatientDetailsByPatientId(Long patientId) {
        return patientDetailsRepository.findByPatientId(patientId);
    }
    

}

