package com.example;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class select {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();
       System.out.println("enter the id to serach");
        Scanner s1=new Scanner(System.in);
        int idsearch=s1.nextInt();
        Lapatab lapatab=em.find(Lapatab.class, idsearch);

        System.out.println("current id"+lapatab.getLapid());
        System.out.println("current name"+lapatab.getLaptabname());
        System.out.println("current price"+lapatab.getLprice());
        trans.commit();

    }
    
}
