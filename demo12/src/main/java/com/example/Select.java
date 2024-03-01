package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Select {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();
        sc1 =new Scanner(System.in);
        int idsearch =sc1.nextInt();
        Student student=em.find(Student.class, idsearch);
        if(student==null){
            //exception throw n;
        }
        System.out.println("current student name"+student.getStudentName());
        System.out.println("current age "+student.getStudentage());
        System.out.println("current department"+student.getStudentdept());

        
    }
    
}
