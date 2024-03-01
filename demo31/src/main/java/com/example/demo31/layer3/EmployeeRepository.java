package com.example.demo31.layer3;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo31.layer2.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{
    Employee findById(int id);
    List<Employee> findAll();
}
