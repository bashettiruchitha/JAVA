package com.example;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class delete {
    public static void main(String[] args) {
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
    EntityManager em=emf.createEntityManager();
    EntityTransaction trans=em.getTransaction();
    trans.begin();
    System.out.println("enter the id to delete");
    Scanner s1=new Scanner(System.in);
    int id=s1.nextInt();
    Flight flight=em.find(Flight.class, id);
    System.out.println("are you sure to delte");
    Scanner s2=new Scanner(System.in);
    String ans=s2.nextLine();
    if(ans.equalsIgnoreCase("y")||ans.equalsIgnoreCase("yes")){
        em.remove(flight);
        trans.commit();
    }
    em.close();

        
    }
    
}
