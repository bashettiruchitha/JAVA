package com.example.demo18.layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient_table")
public class Patient {


    @Id
    @Column(name="patient-id")
    private int patientid;

    @Column(name="patient_name")
    private String patientname;

    @Column(name="treatment")
    private String  treatmentType;

    @Column(name="price")
    private Double price;

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(String treatmentType) {
        this.treatmentType = treatmentType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Patient [patientid=" + patientid + ", patientname=" + patientname + ", treatmentType=" + treatmentType
                + ", price=" + price + "]";
    }


    
}
