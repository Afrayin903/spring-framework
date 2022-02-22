package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {
    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }

    //Wiring manner: call @Bean annotated method in another @Bean annotated
      //@Bean
//    Person person(){
//        Person p = new Person();
//        p.setName("Kahar");
//        p.setCar(car());//call method car() in the person() method
//        return p;
//    }

    //Auto wiring manner: add @Bean annotated method as parameter in another method
    @Bean
    Person person(Car car){//Added car object as a parameter
        Person p = new Person();
        p.setName("Kahar");
        p.setCar(car);//set parameter as an object reference
        return p;
    }
    //Direct wiring
//    @Bean
//    Person person(){
//        Person p = new Person();
//        p.setName("Mike");
//        p.setCar(Car());
//        return p;
//    }
    //Autowiring
//    @Bean
//    Person person(Car car){
//        Person p = new Person();
//        p.setName("Mike");
//        p.setCar(car);
//        return p;
//    }
}
