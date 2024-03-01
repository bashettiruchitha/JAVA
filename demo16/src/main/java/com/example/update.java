package com.example;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class update {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();
        System.out.println("enter the id to modify");
        Scanner s1= new  Scanner(System.in);
        int idsearch= s1.nextInt();
        Lapatab lapatab=em.find(Lapatab.class, idsearch);
        Scanner s2=new Scanner(System.in);
        Scanner s3=new Scanner(System.in);
        System.out.println("enter the name to modify");
        String newname=s2.nextLine();
        System.out.println("enter the price to modify");
        double newprice=s3.nextDouble();  
        lapatab.setLaptabname(newname);
        lapatab.setLprice(newprice);
        em.merge(lapatab);
        trans.commit();
        em.close();


    }
    
}
