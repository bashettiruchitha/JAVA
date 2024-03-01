package com.example.demo26.layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="account_table")
public class Account {
    @Id
    @Column(name="accno")
    private int accno;

    @Column(name="accname")
    private String  accname;

    @Column(name="accbal")
    private float  accbal ;

    public Account(int accno, String accname, float accbal) {
        this.accno = accno;
        this.accname = accname;
        this.accbal = accbal;
    }

    public Account() {
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    public float getAccbal() {
        return accbal;
    }

    public void setAccbal(float accbal) {
        this.accbal = accbal;
    }

    

    
}
