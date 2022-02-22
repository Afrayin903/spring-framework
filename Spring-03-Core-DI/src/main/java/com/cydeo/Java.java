package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//DI is an application of the IoC principle.
//the Spring container "injects" objects into other objects or “dependencies”.
//Dependency injections(DI) ways
//Injecting the value in the field of the class
//Injecting the value through the constructor for the class
//Injecting the value through setter
//when u only have one constructor in the class, you can omit writing the @Autowired annotation

@Component
@AllArgsConstructor //Spring injects all the dependency injections using @AllArgsConstructor, lombok creates constructor for the class
public class Java {
    //Field injection
//    @Autowired
//    OfficeHours officeHours;

    OfficeHours officeHours;

    //Construction injection
    //@Autowired  //when u only have one constructor in the class, you can omit writing the @Autowired annotation
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours: " + (20 + officeHours.getHours()));
    }
}
