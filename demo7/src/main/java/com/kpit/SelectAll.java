package com.kpit;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SelectAll {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Employee> typedQuery = em.createQuery("from Employee", Employee.class);
        List<Employee> EmployeeList = typedQuery.getResultList();
        for (Employee employee : EmployeeList) {
            System.out.println("empnumber" + employee.getEmpNumber());
            System.out.println("emp branch" + employee.getBranch());
            System.out.println("emp names" + employee.getEmpNames());

        }

    }

}
