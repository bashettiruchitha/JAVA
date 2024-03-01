package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class update {
    public static void main(String[] args) {
        try{
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

        Scanner scanner2=new Scanner(System.in);
        Scanner scanner3=new Scanner(System.in);


        System.out.println("enter the new branch");
        String newBranch=scanner2.nextLine();

        System.out.println("enter the new name ");
        String newName=scanner3.nextLine();
        
       emp.setEmpNames(newName);
       emp.setBranch(newBranch);

        em.merge(emp);
        trans.commit();
        em.close();
    }catch(newNumberNotFound e){
        System.out.println("employee number not found"+e);
    }
}
}


