package com.kpit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("myBear")
@Scope("prototype")
class Bear {
    String name;
    @Autowired
    Bear(@Value("bear")String name){

        
        System.out.println("bear() constructor"+name);
    }
    void fetchHoney(){
        System.out.println("bear is fetching honey");
    }

}
    

