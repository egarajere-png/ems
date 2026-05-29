package com.example.ems.service;

import com.example.ems.dto.EmployeeDto;

import java.util.List;

// Service interface defining the contract for employee business logic operations
public interface EmployeeService {
    // Creates a new employee and returns the saved employee data
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updateEmployee);

}
