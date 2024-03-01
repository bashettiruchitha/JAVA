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
        Train train=new Train();
        train.setTrainid(12);
        train.setTrainName("godavariExpress");
        train.setPrice(1200);
        train.setSources("pune");
        train.setDestination("jagityal");
        em.persist(train);
        trans.commit();
    }
}
