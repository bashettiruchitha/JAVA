package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        
        System.out.println( "Hello World!" );
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();

        Student student1=new Student(12, "nadhu", 21, "cse");
        Student student2=new Student(13, "kpit", 40, "exams");
        Student student3=new Student(14, "anusha", 21, "kpit");
       // student.setStudentid(11);
       // student.setStudentName("ruchitha");
        //student.setStudentage(20);
        //student.setStudentdept("cse");
        
        em.persist(student1);
        em.persist(student2);
        em.persist(student3);

        trans.commit();
    }
    }

