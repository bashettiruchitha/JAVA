package com.example.demo19.layer1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ruchith_tbl")
public class Resturant {
  
    @Id
     @Column(name="id")
    private int id; 

    @Column(name="person_name")
    private String pname;

    @Column(name="food_items")
    private String fooditems;
    
    @Column(name="food_price")
    private Double foodprice;

   

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getFooditems() {
        return fooditems;
    }

    public void setFooditems(String fooditems) {
        this.fooditems = fooditems;
    }

    public Double getFoodprice() {
        return foodprice;
    }

    public void setFoodprice(Double foodprice) {
        this.foodprice = foodprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Resturant [pname=" + pname + ", fooditems=" + fooditems + ", foodprice=" + foodprice + ", id=" + id
                + "]";
    }

  

    
}
