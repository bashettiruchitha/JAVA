package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateOperation {

    public static void main(String[] args) {
try{
    EntityManagerFactory factory=Persistence.createEntityManagerFactory("MyJPA");
    EntityManager manager=factory.createEntityManager();
    EntityTransaction transaction=manager.getTransaction();
    transaction.begin();

    System.out.println("enter the flight number to modify");
    Scanner scanner1=new Scanner(System.in);

    int flightNumberToSearch=scanner1.nextInt();
    Flight flight1=manager.find(Flight.class,flightNumberToSearch);

    if(flight1 == null){
        FlightNotFoundException flightNotFoundEx = new FlightNotFoundException("This flight id does not exists !!! "+flightNumberToSearch);
        throw flightNotFoundEx;  

    }
    
   Scanner scanner2=new Scanner(System.in);
   Scanner scanner3=new Scanner(System.in);
   Scanner scanner4=new Scanner(System.in);

   System.out.println("enter the new source");
   String newsrc=scanner2.nextLine();

   System.out.println("enter new destination");
   String newdest=scanner3.nextLine();

   System.out.println("enter new ticket cost");
   double newTicketcost=scanner4.nextDouble();

   System.out.println("setting newsrc,newdest,newticket");
   flight1.setFlightSource(newsrc);
   flight1.setFlightDestination(newdest);
   flight1.setTicketCost(newTicketcost);

   manager.merge(flight1);
   System.out.println("object is modified");

   
    transaction.commit();
    System.out.println("record update");

    manager.close();
    System.out.println("entity manager closed");
}catch(FlightNotFoundException e){
    System.out.println("error"+e);
}
    }
    
    
}
