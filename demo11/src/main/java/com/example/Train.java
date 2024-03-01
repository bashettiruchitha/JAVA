package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Train_tbl")
public class Train {
    @Id
    @Column(name="train_id")
     private int trainid;
    
    @Column(name="train_name")
    private String  trainName;

    @Column(name="ticket_price")
    private double price;

    @Column(name="source")
    private String sources;

    @Column(name="destination")
    private String Destination;

    public Train() { //default constructor
    }

    public int getTrainid() {
        return trainid;
    }

    public void setTrainid(int trainid) {
        this.trainid = trainid;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }
    
}
