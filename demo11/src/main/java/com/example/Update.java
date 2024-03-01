package com.example;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {

        public static void main(String[] args)  {
            
        try{
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the modify number");
        int  searchelement = s1.nextInt();

        Train trainobj=em.find( Train.class, searchelement);

        if(trainobj == null){
            TrainException  n = new TrainException("train exception");
            throw n;

        }
        System.out.println("current train name"+trainobj.getTrainName());
        System.out.println("current ticket cost "+trainobj.getPrice());
        System.out.println("current train source"+trainobj.getSources());
        System.out.println("current tarin destination"+trainobj.getDestination());

        Scanner s2=new Scanner(System.in);
        Scanner s3=new Scanner(System.in);
        Scanner s4=new Scanner(System.in);
        Scanner s5=new Scanner(System.in);

        System.out.println("enter the train name ");
        String newTrainname=s2.nextLine();

        System.out.println("enter the price");
        double newPrice=s3.nextDouble();

        System.out.println("enter the source");
        String newSource=s4.nextLine();

        System.out.println("enter the destination");
        String newDestination = s5.nextLine();

        trainobj.setTrainName(newTrainname);
        trainobj.setPrice(newPrice);
        trainobj.setSources(newSource);
        trainobj.setDestination(newDestination);

        em.merge(trainobj);
        trans.commit();
        em.close();


    }catch(TrainException e){
    System.out.println("train  not fount exception "+e);
}
}

}