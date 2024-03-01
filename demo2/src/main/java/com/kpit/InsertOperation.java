package com.kpit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertOperation {
        public static void main(String[] args) {
{
    EntityManagerFactory factory=Persistence.createEntityManagerFactory("MyJPA");
    EntityManager manager=factory.createEntityManager();
    EntityTransaction transaction=manager.getTransaction();
    transaction.begin();
    Flight flight1=new Flight(12,"hyd","pune",4500);
    Flight flight2=new Flight(13,"mumbai","pune",4500);
    Flight flight3=new Flight(14,"hyd","london",4500);
    manager.persist(flight1);
    manager.persist(flight2);
    manager.persist(flight3);

   
    transaction.commit();
    }
    
    
}

    
}
