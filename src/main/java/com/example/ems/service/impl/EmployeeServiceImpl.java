package com.example.ems.service.impl;

import org.springframework.stereotype.Service;

import com.example.ems.dto.EmployeeDto;
// Removed unused import to fix resolution error; use local var for inferred types
import com.example.ems.mapper.EmployeeMapper;
import com.example.ems.repository.EmployeeRepository;
import com.example.ems.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        var employee = EmployeeMapper.mapToEmployee(employeeDto);
        var savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}