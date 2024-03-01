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
        System.out.println("enter to id to delete");
        Scanner s1=new Scanner(System.in);
        int newid=s1.nextInt();
        Lapatab lapatab=em.find(Lapatab.class, newid);
        System.out.println("are you sure what to delete ");
        Scanner s2=new Scanner(System.in);
        String ans=s2.nextLine();
        if(ans.equalsIgnoreCase("yes")||ans.equalsIgnoreCase("y"))
        {
            em.remove(lapatab);
            trans.commit();
        }
        else{
            System.out.println("not deleted ");
        }
        em.close();

    }
    
}
