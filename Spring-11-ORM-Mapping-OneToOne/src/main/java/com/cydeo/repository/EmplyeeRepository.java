package com.cydeo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cydeo.entity.Employee;

public interface EmplyeeRepository extends JpaRepository<Employee, Integer> {
}
