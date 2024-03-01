package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SelectAll {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Train> thetrain=em.createQuery("from train_tbl",Train.class);
        List<Train> trainlist =thetrain.getResultList();
        for(Train train:trainlist){
            System.out.println("trainnumber"+train.getTrainName());
            System.out.println("train ticket "+train.getPrice());
            System.out.println("train source"+train.getSources());
            System.out.println("trainDestination"+train.getDestination());
        }
    }
    
}
