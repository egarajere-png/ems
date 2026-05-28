package com.example.ems.service;

import com.example.ems.dto.EmployeeDto;

// Service interface defining the contract for employee business logic operations
public interface EmployeeService {
    // Creates a new employee and returns the saved employee data
    EmployeeDto createEmployee(EmployeeDto employeeDto);

}
