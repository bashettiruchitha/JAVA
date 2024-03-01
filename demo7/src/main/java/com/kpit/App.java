package com.kpit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
EntityManager em=emf.createEntityManager();
EntityTransaction trans=em.getTransaction();
trans.begin();
Employee emp=new Employee();

emp.setEmpNumber(101);
emp.setBranch("cme");
emp.setEmpNames("anu");
em.persist(emp);
trans.commit();


    }
}

    

