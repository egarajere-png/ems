package com.example.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;
import com.example.ems.entity.employee;

public interface EmployeeRepository extends JpaRepository<employee, Long> {


}
