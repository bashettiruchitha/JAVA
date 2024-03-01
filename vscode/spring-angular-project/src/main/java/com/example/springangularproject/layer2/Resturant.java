package com.example.springangularproject.layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="resturant_tbl")
@Getter
@Setter
@NoArgsConstructor
public class Resturant {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="food_items")
    private String fooditems;

    @Column(name="food_price")
    private double foodprice;

    @Column(name="person_name")
    private String pname;
    
}
