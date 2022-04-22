package com.cydeo.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {  //employee

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

}
