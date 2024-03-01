package com.example.demo31.layer4;

import java.util.List;

import com.example.demo31.layer2.Employee;

public interface EmployeeService {
    Employee addeEmployee(Employee employee);
    Employee updateEmployee( int id,Employee employee);
    void removeemployee(int id);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();

    
}
