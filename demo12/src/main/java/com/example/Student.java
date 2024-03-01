package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
    @Id
    @Column(name="student_id")
    private  int Studentid;
    
    @Column(name="student_name")
    private  String studentName;

    @Column(name="studentage")
    private int studentage;
    
    @Column(name="studentdept")
    private String studentdept;

    public Student(int studentid, String studentName, int studentage, String studentdept) {
        Studentid = studentid;
        this.studentName = studentName;
        this.studentage = studentage;
        this.studentdept = studentdept;
    }

    public Student() {
    }

    public int getStudentid() {
        return Studentid;
    }

    public void setStudentid(int studentid) {
        Studentid = studentid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public String getStudentdept() {
        return studentdept;
    }

    public void setStudentdept(String studentdept) {
        this.studentdept = studentdept;
    }


}
