package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lapatab")
public class Lapatab {
    @Id  
    @Column(name="lapid")
    int lapid;
    
    @Column(name="lapname")
    private String laptabname;

    @Column(name="lapprice")
    private double lprice;

    public Lapatab() {
    }

    public Lapatab(int lapid, String laptabname, double lprice) {
        this.lapid = lapid;
        this.laptabname = laptabname;
        this.lprice = lprice;
    }

    public int getLapid() {
        return lapid;
    }

    public void setLapid(int lapid) {
        this.lapid = lapid;
    }

    public String getLaptabname() {
        return laptabname;
    }

    public void setLaptabname(String laptabname) {
        this.laptabname = laptabname;
    }

    public double getLprice() {
        return lprice;
    }

    public void setLprice(double lprice) {
        this.lprice = lprice;
    }
  
}
