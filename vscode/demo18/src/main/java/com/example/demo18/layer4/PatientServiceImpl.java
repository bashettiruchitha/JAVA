package com.example.demo18.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo18.layer2.Patient;
import com.example.demo18.layer3.PatientRepository;

@Service

public class PatientServiceImpl implements PatientService{
    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient addpatient(Patient patient) {
        return patientRepository.save(patient);
        
    }

    @Override
    public Patient updatePatient(int id, Patient updatePatient) {
       Patient patient2=patientRepository.findById(id);
       
       if(updatePatient.getPatientname()!=null){
        patient2.setPatientname(updatePatient.getPatientname());
       }
       if(updatePatient.getPrice()!=0.0){
        patient2.setPrice(updatePatient.getPrice());
       }
       if(updatePatient.getTreatmentType()!=null){
        patient2.setTreatmentType(updatePatient.getTreatmentType());

       }
       if(updatePatient.getPatientid()!=0){
        patient2.setPatientid(updatePatient.getPatientid());
       }
       return patientRepository.save(patient2);
    }

    @Override
    public void remove(int id) {
        patientRepository.deleteById(id);
        
    }

    @Override
    public Patient getById(int id)
    {
        return patientRepository.findById(id);
        
    }

    @Override
    public List<Patient> getAll()
     {
        return patientRepository.findAll();
       
    }
    
}
