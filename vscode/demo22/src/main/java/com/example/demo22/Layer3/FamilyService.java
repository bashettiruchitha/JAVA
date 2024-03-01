package com.example.demo22.Layer3;

import java.util.List;

import com.example.demo22.Layer1.Family;

public interface FamilyService {
    Family addFamily(Family family);
    Family updateFamily(int id,Family family);
    void removefamily(int id);
    Family getByidFamily(int id);
    List<Family> getAllFamilies();

    
}
