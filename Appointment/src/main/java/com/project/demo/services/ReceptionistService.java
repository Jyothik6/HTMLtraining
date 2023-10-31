package com.project.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.entities.PatientDetails;
import com.project.demo.entities.Receptionist;
import com.project.demo.repository.ReceptionistRepository;
import com.project.demo.repository.PatientDetailsRepository; // Import the PatientDetailsRepository

@Service
public class ReceptionistService {
    @Autowired
    private ReceptionistRepository receptionistRepository;

    @Autowired
    private PatientDetailsRepository patientDetailsRepository; // Inject the PatientDetailsRepository

    public void registerReceptionist(String username, String password) {
        Receptionist receptionist = new Receptionist(username, password);
        receptionistRepository.save(receptionist);
    }

    public Receptionist findReceptionistByUsernameAndPassword(String username, String password) {
        return receptionistRepository.findByUsernameAndPassword(username, password);
    }

    public Iterable<PatientDetails> getAllPatientDetails() {
        return patientDetailsRepository.findAll();
    }

    public String savePatientDetails(PatientDetails patientDetails) {
        patientDetailsRepository.save(patientDetails);
        return "Patient Details Added";
    }
}
