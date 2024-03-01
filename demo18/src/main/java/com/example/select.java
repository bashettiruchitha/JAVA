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
    System.out.println("enter the id to select");
    Scanner s1=new Scanner(System.in);
    int id=s1.nextInt();
    Flight flight=em.find(Flight.class, id);
    System.out.println("current details----");
    System.out.println("current no"+flight.getFlightno());
    System.out.println("current name"+flight.getFlightname());
      System.out.println("current source"+flight.getFlightsource());
    System.out.println("current des"+flight.getFlightdes());
    trans.commit();
  
    }
    
}
