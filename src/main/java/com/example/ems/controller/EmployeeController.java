package com.example.ems.controller;

import com.example.ems.dto.EmployeeDto;
import com.example.ems.service.EmployeeService;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// REST API endpoint controller for employee operations
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    // Injected service for business logic
    private EmployeeService employeeService;

    // POST /api/employees - Creates a new employee
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        // Call service to create and save employee
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        // Return the saved employee with HTTP 201 CREATED status
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}