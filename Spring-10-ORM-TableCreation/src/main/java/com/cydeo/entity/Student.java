package com.cydeo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    /*Auto generate primary key value in db,
     no need to generate it by inserting manually using data.sql*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fName;
    private String lName;
    private String email;
}
