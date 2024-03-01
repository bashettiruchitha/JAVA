package com.example.demo19.layer3;

import java.util.List;

import com.example.demo19.layer1.Resturant;

public interface ResturantService {

    Resturant addResturant(Resturant resturant);
    Resturant updResturant(int id,Resturant resturant);
    void remove(int id);
    Resturant getByIdResturant(int id);
    List<Resturant> getAllResturants();
}
    

