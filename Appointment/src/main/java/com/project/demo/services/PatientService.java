package com.project.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.project.demo.entities.Patient;
import com.project.demo.entities.PatientDetails;
import com.project.demo.repository.PatientRepository;
 
@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
 
    public Patient registerPatient(String username, String password) {
        // Check if the username already exists
        if (patientRepository.findByUsername(username) != null) {
            // Username is already in use, handle this case
            return null;
        }
        // Create a new patient and save it to the database
        Patient patient = new Patient();
        patient.setUsername(username);
        // You should hash and salt the password here for security
        patient.setPassword(password);
        // Set other patient-specific fields if needed
        return patientRepository.save(patient);
    }
 
    public Patient loginPatient(String username, String password) {
        // Find the patient by username
        Patient patient = patientRepository.findByUsername(username);
 
        // Check if the patient exists and the password is correct (you should compare hashed passwords)
        if (patient != null && patient.getPassword().equals(password)) {
            return patient;
        } else {
            // Invalid login, handle this case
            return null;
        }
    }
   

}
