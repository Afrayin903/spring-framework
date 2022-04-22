package com.cydeo.entity;

import com.cydeo.enums.Gender;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="students")
public class Student {

    @Id
    /*Auto generate primary key value in db,
     no need to generate it by inserting manually using data.sql*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="studentFirstName")//change column name
    private String fName;
    @Column(name="studentLastName")
    private String lName;
    private String email;

    @Transient//Annotation is not bring any column in the table
    private String city;

    @Column(columnDefinition = "DATE")
    private LocalDate birthdate;
    @Column(columnDefinition = "TIME")
    private LocalDate birthtime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthDateTime;

    @Enumerated(EnumType.STRING)//enum translates to string
    private Gender gender;
}
