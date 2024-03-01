package com.example.springangularproject.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springangularproject.layer2.Resturant;

@Service
public interface ResturantService {
    // create
    Resturant addResturant(Resturant Resturant);
    //read
    Resturant viewResturant(int id);
    //update
    Resturant updateResturant(Resturant resturant);
    //delete
    void deleteResturant(int id);
    //read all
    List<Resturant> viewAllResturants();
}
