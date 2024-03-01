package com.example.demo22.Layer2;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo22.Layer1.Family;
@Repository

public interface FamilyRepository extends CrudRepository<Family,Integer> {
    Family findById( int id);
    List<Family> findAll();
}
