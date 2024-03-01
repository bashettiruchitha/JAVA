package com.example.demo19.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo19.layer1.Resturant;
import com.example.demo19.layer3.ResturantService;

@RestController
@RequestMapping("/ruchitha")
@CrossOrigin(origins = "http://localhost:4200")
public class ResturantController {
    @Autowired
    ResturantService resturantService;

    @PostMapping("/add")
    public Resturant addResturant(@RequestBody Resturant resturant) {
        return resturantService.addResturant(resturant);
    
    }

    @PutMapping("/update/{id}")
    public Resturant updResturant(@PathVariable int id, @RequestBody Resturant resturant){
        return resturantService.updResturant(id,resturant);
    }
    @DeleteMapping("/remove/{id}")
     public void remove(@PathVariable int id) {
        resturantService.remove(id);
       
    }
    @GetMapping("/get/{id}")
     public Resturant getByIdResturant(@PathVariable int id) {
       return  resturantService.getByIdResturant(id);
       
    }
    @GetMapping("/getall")
     public List<Resturant> getAllResturants() {
        System.out.println("Getting resturants");
        return resturantService.getAllResturants();
       
    }
    

    



    
}
