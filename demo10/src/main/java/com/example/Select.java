package com.example;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Select {
    public static void main(String[] args) {
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();
        Scanner s1= new  Scanner(System.in);
        int searchelement =s1.nextInt();
        Train trainobj =em.find(Train.class, searchelement);
        if(trainobj == null)
        {
            TrainException n = new TrainException("train not found");
            throw n;
        }
        System.out.println("current train name "+trainobj.getTrainName());
        System.out.println("cureent ticket price "+trainobj.getPrice());;
        System.out.println("current source "+trainobj.getSources());
        System.out.println("current destination"+trainobj.getDestination());
    
        } 
    }
