package com.example.ems.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.ems.dto.EmployeeDto;
import com.example.ems.entity.employee;
import com.example.ems.exception.ResourceNotFoundException;
// Removed unused import to fix resolution error; use local var for inferred types
import com.example.ems.mapper.EmployeeMapper;
import com.example.ems.repository.EmployeeRepository;
import com.example.ems.service.EmployeeService;

import lombok.AllArgsConstructor;

// Implementation of EmployeeService containing business logic for employee operations
@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    // Repository to handle d8080 (atabase operations
    private final EmployeeRepository employeeRepository;

    // Converts DTO to entity, saves to DB, and returns the saved entity as DTO
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        // Convert incoming DTO to entity
        var employee = EmployeeMapper.mapToEmployee(employeeDto);
        // Persist to database
        var savedEmployee = employeeRepository.save(employee);
        // Convert saved entity back to DTO for response
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        // TODO Auto-generated method stub
//        
        employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        // TODO Auto-generated method stub
        List<employee> employee = employeeRepository.findAll();
        return employee.stream().map((employee1) -> EmployeeMapper.mapToEmployeeDto(employee1)).collect(Collectors.toList());
    }
}