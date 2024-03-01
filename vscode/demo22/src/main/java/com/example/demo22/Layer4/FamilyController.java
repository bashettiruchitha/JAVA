package com.example.demo22.Layer4;

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

import com.example.demo22.Layer1.Family;
import com.example.demo22.Layer3.FamilyService;

@RestController
@RequestMapping("/family")
@CrossOrigin(origins="http://localhost:4200")
public class FamilyController {
    @Autowired
    FamilyService familyService;

    @PostMapping("/add")
     public Family addFamily(@RequestBody Family family) {
        return  familyService.addFamily(family);
    }
    @PutMapping("/update")
    public Family updateFamily(@PathVariable int id, @RequestBody Family family1) {
        return familyService.updateFamily(id, family1);
    }

    @DeleteMapping("/delete")
    
     public void removefamily(@PathVariable int id) {
        familyService.removefamily(id);
    }

    @GetMapping("/get")
     public Family getByidFamily(@PathVariable int id) {
    return familyService.getByidFamily(id);
    }

    @GetMapping("/GetAll")
     public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }
    
}
