package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class selectAll {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager(); 
        EntityTransaction trans=em.getTransaction();
        trans.begin();

        TypedQuery<Lapatab>thTypedQuery=em.createQuery("from Lapatab",Lapatab.class);
        List<Lapatab>lapatabslList=thTypedQuery.getResultList();

        for (Lapatab lapatab : lapatabslList)
         {
            System.out.println("lapatab id"+lapatab.getLapid());
            System.out.println("lapatab name "+lapatab.getLaptabname());
            System.out.println("lapatab price"+lapatab.getLprice());
            System.out.println("---------------");
            
        
        trans.commit();
        em.close();
    }
}
}
