package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class selectAll{
    public static void main(String[] args) {
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
    EntityManager em=emf.createEntityManager();
    EntityTransaction trans=em.getTransaction();
    trans.begin();
    TypedQuery<Flight>thTypedQuery=em.createQuery("from flight",Flight.class);
    List<Flight>flightlList=thTypedQuery.getResultList();
    for (Flight flight : flightlList) {
        System.out.println("current details----");
        System.out.println("current no"+flight.getFlightno());
        System.out.println("current name"+flight.getFlightname());
          System.out.println("current source"+flight.getFlightsource());
        System.out.println("current des"+flight.getFlightdes());
        trans.commit();
        em.close();
        
    }
    }
}