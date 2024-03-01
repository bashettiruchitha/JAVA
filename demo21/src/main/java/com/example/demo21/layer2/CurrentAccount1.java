package com.example.demo21.layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="accountdetails")
public class CurrentAccount1 {
    @Id
    @Column(name="acid")
    private  int acid;

     @Column(name="accname")
     private String Accname;
     
     @Column(name="acc_bal")
     private double balance;

    public int getAcid() {
        return acid;
    }

    public void setAcid(int acid) {
        this.acid = acid;
    }

    public String getAccname() {
        return Accname;
    }

    public void setAccname(String accname) {
        Accname = accname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CurrentAccount1 [acid=" + acid + ", Accname=" + Accname + ", balance=" + balance + "]";
    }

    
}
