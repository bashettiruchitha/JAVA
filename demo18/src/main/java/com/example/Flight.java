package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {
    @Id
    @Column(name="flightno")
    private int flightno;
    @Column(name="flightname")
    private String flightname;
    @Column(name="flightsource")
    private String flightsource;
    @Column(name="flightdestination")
    private String flightdes;
    
    public Flight(int flightno, String flightname, String flightsource, String flightdes) {
        this.flightno = flightno;
        this.flightname = flightname;
        this.flightsource = flightsource;
        this.flightdes = flightdes;
    }
    public int getFlightno() {
        return flightno;
    }
    public void setFlightno(int flightno) {
        this.flightno = flightno;
    }
    public String getFlightname() {
        return flightname;
    }
    public void setFlightname(String flightname) {
        this.flightname = flightname;
    }
    public String getFlightsource() {
        return flightsource;
    }
    public void setFlightsource(String flightsource) {
        this.flightsource = flightsource;
    }
    public String getFlightdes() {
        return flightdes;
    }
    public void setFlightdes(String flightdes) {
        this.flightdes = flightdes;
    }
    
}
