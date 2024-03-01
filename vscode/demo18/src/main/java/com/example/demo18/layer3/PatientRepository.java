package com.example.demo18.layer3;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo18.layer2.Patient;

public interface PatientRepository extends CrudRepository<Patient,Integer> {
    Patient findById(int id);
    List<Patient> findAll();

}
