package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SelectAll {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();

        TypedQuery<Student> student =em.createQuery("from student_details",Student.class);
        List<Student> thelist=student.getResultList();
    for(Student student1:thelist){
        System.out.println("student id"+student1.getStudentid());
        System.out.println("student name "+student1.getStudentName());
        System.out.println("student age"+student1.getStudentage());
        System.out.println("student dept "+student1.getStudentdept());

    }
    em.close();

    
    }
    
}
