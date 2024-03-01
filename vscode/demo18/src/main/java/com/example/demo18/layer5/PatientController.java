package com.example.demo18.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo18.layer2.Patient;
import com.example.demo18.layer4.PatientService;

@RestController
@RequestMapping("/patient")
@CrossOrigin(origins ="http://localhost:4200")
public class PatientController {
@Autowired
PatientService patientService;

    @PostMapping("/add")
    public Patient addpatient(@RequestBody Patient patient) {
        return patientService.addpatient(patient);
        
    }

    @PutMapping("/update/{id}")
     public Patient updatePatient(@PathVariable int id, @RequestBody Patient updatePatient) {
        return patientService.updatePatient(id,updatePatient);
     }

     @DeleteMapping("/delete/{id}")
      public void remove(@PathVariable int id) {
        patientService.remove(id);
        
    }
    @GetMapping("/get/{id}")
    public Patient getById(@PathVariable int id) {
        return patientService.getById(id);
        
    }
    @GetMapping("/getAll")
    public List<Patient> getAllPatients() {
        return patientService.getAll();
       
    }


}

