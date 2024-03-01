package com.example;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Delete{
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em= emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the id through delete");
        int studentid=s1.nextInt();
        Student  student=em.find(Student.class, studentid);
        System.out.println("id is entered"+student.getStudentid());
        Scanner s2=new Scanner(System.in);
        String ans=s2.nextLine();
        if(ans.equalsIgnoreCase("yes")||ans.equalsIgnoreCase("y"))
        {
            em.remove(s1);
            trans.commit();
        }
    }
}
