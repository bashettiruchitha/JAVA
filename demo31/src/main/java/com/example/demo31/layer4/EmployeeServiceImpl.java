package com.example.demo31.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo31.layer2.Employee;
import com.example.demo31.layer3.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeerepo;

    @Override
    public Employee addeEmployee(Employee employee) {
        return employeerepo.save(employee);
    }

    @Override
    public Employee updateEmployee(int id, Employee updateemployee) {
        Employee employee=employeerepo.findById(id);
        if(updateemployee.getEmpname()!=null){
            employee.setEmpname(updateemployee.getEmpname());
        }
        return employeerepo.save(employee);
        
    }

    @Override
    public void removeemployee(int id) {
        employeerepo.deleteById(id);
    }

    @Override
    public Employee getEmployeeById(int id) {
       return employeerepo.findById(id);
    }

    @Override
    public List<Employee> getAllEmployees()
    {
        return employeerepo.findAll();
    }

    
}
