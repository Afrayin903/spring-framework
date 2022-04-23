package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Department")
@Data
@NoArgsConstructor
public class Department extends BaseEntity{
    private String department;
    private String division;

}
