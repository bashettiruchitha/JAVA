package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class insert 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();
        Lapatab l1=new Lapatab(1, "hp", 5000);
        Lapatab l2=new Lapatab(2, "lenovo", 60000);
        Lapatab l3=new Lapatab(3, "dell", 7000);
        Lapatab l4=new Lapatab(4, "apple", 80000);
        em.persist(l1);
        em.persist(l2);
        em.persist(l3);
        em.persist(l4);
        trans.commit();
    }
}
