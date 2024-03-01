package com.example.springangularproject.layer5;

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

import com.example.springangularproject.layer2.Resturant;
import com.example.springangularproject.layer4.ResturantService;

@RestController
@RequestMapping("/resturant")
@CrossOrigin(origins = "http://localhost:4200")
public class ResturantController {
    //injecting the object of service
    @Autowired
    private ResturantService resturantService;

    // create
    @PostMapping("/addResturant")
    public Resturant addResturant(@RequestBody Resturant resturant) {
        return resturantService.addResturant(resturant);
    }
    // update  
    @PutMapping("/updateResturant")
    public Resturant updateResturant(@RequestBody Resturant resturant){
        return resturantService.updateResturant(resturant);
    }
    // read
    @GetMapping("/viewResturant/{id}")
    public Resturant viewResturant(@PathVariable("id") int id){
        return resturantService.viewResturant(id);
    }
    // read all
    @GetMapping("/viewAllResturants")
    public List<Resturant> viewAllResturants(){
        return resturantService.viewAllResturants();
    }
    // delete
    @DeleteMapping("/deleteResturant/{id}")
    public void deleteResturant(@PathVariable("id") int id){
        resturantService.deleteResturant(id);
    }
}
