package com.kpit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")

public class Employee {
    
@Id
@Column(name="emp_no")
private int empNumber;



@Column(name="emp_branch")
private String branch;



public String getBranch() {//branch
    return branch;
}

public void setBranch(String branch) {
    this.branch = branch;
}

public int getEmpNumber() {//number
    return empNumber;
}

public void setEmpNumber(int empNumber) {
    this.empNumber = empNumber;
}
@Column(name="emp_names")//name
private  String  empNames;

public String getEmpNames() {
    return empNames;
}

public void setEmpNames(String empNames) {
    this.empNames = empNames;
}
    
}

