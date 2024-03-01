package com.example.demo22.Layer3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo22.Layer1.Family;
import com.example.demo22.Layer2.FamilyRepository;

@Service
public class FamilyServiceImpl implements  FamilyService {

    @Autowired
    FamilyRepository familyrepo;

    @Override
    public Family addFamily(Family family)
    {
        return  familyrepo.save(family);
    }

    @Override
    public Family updateFamily(int id, Family family1) {
        Family r=familyrepo.findById(id);

        if(family1.getPname()!=null){
            r.setPname(family1.getPname());
        }
        return familyrepo.save(family1);

    }

    @Override
    public void removefamily(int id) {
        familyrepo.deleteById(id);
    }

    @Override
    public Family getByidFamily(int id) {
    return familyrepo.findById(id);
    }

    @Override
    public List<Family> getAllFamilies() {
        return familyrepo.findAll();
    }
    
}
