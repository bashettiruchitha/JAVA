package com.kpit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*@Configuration
@Component("com.kpit")
class Config{
    @Bean
    public String name(){
        System.out.println("");
        retrun Jack;
    }

}*/


@Component("myTiger")
@Scope("prototype")
public class Tiger {
    String name;
    @Autowired
    Tiger(@Value("Jacky")String name){
        System.out.println("tiger is created"+name);

    }
    
    
}


