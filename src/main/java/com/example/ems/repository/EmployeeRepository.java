package com.example.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ems.entity.employee;

// Data access layer: provides CRUD operations for employee entity
// JpaRepository automatically implements save(), findById(), findAll(), delete(), etc.
public interface EmployeeRepository extends JpaRepository<employee, Long> {


}
