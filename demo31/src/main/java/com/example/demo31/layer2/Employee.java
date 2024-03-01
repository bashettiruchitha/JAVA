package com.example.demo31.layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_details")
public class Employee {
    @Id
    @Column(name="empid")
    private int empid;

    @Column(name="empname")
    private String empname;
    
    @Column(name="empsalary")
    private float empsalary;

    public Employee(int empid, String empname, float empsalary) {
        this.empid = empid;
        this.empname = empname;
        this.empsalary = empsalary;
    }
    public Employee() {
    }
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getEmpname() {
        return empname;
    }
    public void setEmpname(String empname) {
        this.empname = empname;
    }
    public float getEmpsalary() {
        return empsalary;
    }
    public void setEmpsalary(float empsalary) {
        this.empsalary = empsalary;
    }
    
}
