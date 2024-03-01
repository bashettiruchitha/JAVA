package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Select 
{
    public static void main(String[] args)
    {
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();

        System.out.println("enter the modify the number");
        Scanner scanner1=new Scanner(System.in);
        int  newNumber=scanner1.nextInt();

        Employee emp=em.find(Employee.class, newNumber);

        if(emp == null){
            newNumberNotFound n= new newNumberNotFound("number not found");
            throw n;
        }
        System.out.println("enter the current numbwer"+emp.getEmpNumber());
        System.out.println("enter the current name"+emp.getEmpNames());
        System.out.println("enter the current branch"+emp.getBranch());
    
    } 
    
    
    }




