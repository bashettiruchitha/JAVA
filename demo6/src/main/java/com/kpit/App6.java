package com.kpit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App6{
    public static void main(String[] args) {
        
        System.out.println("=> Creating application context...");

    ApplicationContext context = new ClassPathXmlApplicationContext("myspringAnno.xml");
        System.out.println("=> Context is created.."+context);

    
     //   Car theCar = (Car) context.getBean("myCar");

       // theCar.drive();
Tiger tiger=(Tiger) context.getBean("myTiger");
BengalTiger bengalTiger=(BengalTiger) context.getBean("myBengalTiger");
Bear bear=(Bear)context.getBean(Bear.class);
bear.fetchHoney();


        

    }
}



