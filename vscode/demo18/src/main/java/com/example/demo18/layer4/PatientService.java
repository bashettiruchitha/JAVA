package com.example.demo18.layer4;

import java.util.List;

import com.example.demo18.layer2.Patient;

public interface PatientService {
    Patient addpatient (Patient patient);
    Patient updatePatient(int id,Patient patient);
    void remove(int id);
    Patient getById(int id);
    List<Patient> getAll();

    
}
 
    

