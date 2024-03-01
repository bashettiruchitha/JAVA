package com.kpit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("myBengalTiger")
@Scope("prototype")
class BengalTiger extends Tiger{
    @Autowired
    BengalTiger(@Value("jony")String name){
        super(name);
        System.out.println("bengalTiger() constructor"+name);
    }
    



}
