package com.example.demo03.layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="burger")
public class Burger {
    @Id
    @Column(name="bid")
    private int bid;
    @Column(name="bname")
    private String bname;
    @Column(name="bprice")
    private int  bprice;
    public Burger() {
    }
    public int getBid() {
        return bid;
    }
    public void setBid(int bid) {
        this.bid = bid;
    }
    public String getBname() {
        return bname;
    }
    public void setBname(String bname) {
        this.bname = bname;
    }
    public int getBprice() {
        return bprice;
    }
    public void setBprice(int bprice) {
        this.bprice = bprice;
    }
    @Override
    public String toString() {
        return "Burger [bid=" + bid + ", bname=" + bname + ", bprice=" + bprice + "]";
    }
    
}
