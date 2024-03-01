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
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();
        Flight flight=new Flight(1, "fligh1", "pune", "hyd");
        Flight flight2=new Flight(2, "flight2", "hyd", "pune");
        Flight flight3=new Flight(3, "f4", "vizag", "pune");
        em.persist(flight);
        em.persist(flight2);
        em.persist(flight3);
        trans.commit();
    }
}
