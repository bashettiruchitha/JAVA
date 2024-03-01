package com.example.springangularproject.layer4;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springangularproject.layer2.Resturant;
import com.example.springangularproject.layer3.ResturantRepository;

@Service
public class ResturantServiceImpl implements ResturantService{

    // injecting object of repository
    @Autowired
    private ResturantRepository resturantRepo;

    @Override
    public Resturant addResturant(Resturant resturant) {
       Optional<Resturant> opt = resturantRepo.findById(resturant.getId());

       // checking if the record is already present in the db
       if(opt.isPresent()){
        throw new RuntimeException("Resturant already present with id: "+ resturant.getId());
       } else {
        return resturantRepo.save(resturant);
       }
    }

    @Override
    public Resturant viewResturant(int id) {
       Optional<Resturant> opt = resturantRepo.findById(id);

       // if present return the resturant object
       if(opt.isPresent()){
        Resturant resturant = opt.get();
        return resturant;
       }
       // if not present then throw an error
       else {
        throw new RuntimeException("Resturant not found with id: "+id);
       }
    }

    @Override
    public Resturant updateResturant(Resturant resturant) {
        Optional<Resturant> opt = resturantRepo.findById(resturant.getId());

        // if present then update the record using the object passed as the method argument
        if(opt.isPresent()){
           return resturantRepo.save(resturant);
        }
        // else throw not found error
         else {
        throw new RuntimeException("Resturant not found with id: "+resturant.getId());
       }
    }

    @Override
    public void deleteResturant(int id) {
         Optional<Resturant> opt = resturantRepo.findById(id);

        // if present then delete the record
        if(opt.isPresent()){
            Resturant resturantObj = opt.get();
            resturantRepo.delete(resturantObj);
        }
        // else throw not found error
         else {
        throw new RuntimeException("Resturant not found with id: "+id);
       }
    }

    @Override
    public List<Resturant> viewAllResturants() {
        return (List<Resturant>) resturantRepo.findAll();
    }
    
}
