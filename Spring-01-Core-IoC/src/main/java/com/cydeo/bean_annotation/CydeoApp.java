package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        //construct a container
        //left side is a interface and right side is implementation
        ApplicationContext  container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        //PartTimeMentor pt = container.getBean("p1", PartTimeMentor.class);
        PartTimeMentor pt = container.getBean(PartTimeMentor.class);
        pt.createAccount();
        ft.createAccount();

        Integer nm = container.getBean(Integer.class);
        System.out.println(nm);

    }
}
