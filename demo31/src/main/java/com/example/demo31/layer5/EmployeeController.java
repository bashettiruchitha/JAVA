package com.example.demo31.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo31.layer2.Employee;
import com.example.demo31.layer4.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    @PostMapping("/add")
    public Employee addeEmployee(@RequestBody Employee employee) {
        return employeeService.addeEmployee(employee);
    }

    @PutMapping("/update/{id}")
     public Employee updateEmployee(@PathVariable int id,@RequestBody Employee updateemployee)
    {
    return employeeService.updateEmployee(id,updateemployee);
    
}
@DeleteMapping("/remove/{id}")
 public void removeemployee(@PathVariable int id) {
        employeeService.removeemployee(id);
    }
    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
     }
     @GetMapping("/getAll")
       public List<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }

}
