package com.example.ems.mapper;


import com.example.ems.dto.EmployeeDto;
import com.example.ems.entity.employee;


public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(employee employee){
        return new EmployeeDto(
            employee.getId(),
            employee.getFirstName(),
            employee.getLastName(),
            employee.getEmail()
        );
    }
    public static employee mapToEmployee(EmployeeDto employeeDto){
        return new employee(
            employeeDto.getId(),
            employeeDto.getFirstName(),
            employeeDto.getLastName(),
            employeeDto.getEmail()
        );
    }
 

}
