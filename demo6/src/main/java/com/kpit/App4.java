package com.kpit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {
    public static void main(String[] args) {
        
        System.out.println("=> Creating application context...");

        ApplicationContext context = new ClassPathXmlApplicationContext("myspring.xml");
        System.out.println("=> Context is created.."+context);

        System.out.println("1 asking context to get a bean via getBean()");
        Rose rose=(Rose)context.getBean("myRose1");
        rose.flowering();
        System.out.println("=================");


        System.out.println("1 asking context to get a bean via getBean() ");
        Lotus lotus1 =  (Lotus) context.getBean("myLotus1");
        lotus1.flower();
        System.out.println("-------");

        System.out.println("2 asking context to get a bean via getBean() ");
        Lotus lotus2 =  (Lotus) context.getBean("myLotus2");
        lotus2.flower();

        System.out.println("-------");
        System.out.println("3 asking context to get a bean via getBean() ");
        Lotus lotus3 =  (Lotus) context.getBean("myLotus3");
        lotus3.flower();

        System.out.println("=========");
        System.out.println("1 asking context to get a bean via getBean() ");
        Lilly lilly=(Lilly)context.getBean("myLilly1");
        lilly.plucking();
    }
}
