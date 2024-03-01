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
    Scanner s1=new  Scanner(System.in);
    int idsearch=s1.nextInt();
    Flight flight=em.find(Flight.class, idsearch);
    Scanner s2=new Scanner(System.in);
    Scanner s3=new Scanner(System.in);
    Scanner s4=new Scanner(System.in);

     System.out.println("enter the name");
    String newname=s2.nextLine();

  System.out.println("enter the new source");
  String newsource=s3.nextLine();

  System.out.println("enter the new destination");
  String newdes=s4.nextLine();
  flight.setFlightname(newname);
  flight.setFlightsource(newsource);
  flight.setFlightdes(newdes);
  em.merge(flight);
  trans.commit();
  em.close();



    

    }

   
    
}
