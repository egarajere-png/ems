package com.example.ems.mapper;

import com.example.ems.dto.EmployeeDto;
import com.example.ems.entity.employee;

// Utility class for converting between entity and DTO
// Keeps presentation layer (DTO) separated from data layer (Entity)
public class EmployeeMapper {

    // Converts database entity to data transfer object for API responses
    public static EmployeeDto mapToEmployeeDto(employee employee){
        return new EmployeeDto(
            employee.getId(),
            employee.getFirstName(),
            employee.getLastName(),
            employee.getEmail()
        );
    }
    
    // Converts incoming DTO to database entity for persistence
    public static employee mapToEmployee(EmployeeDto employeeDto){
        return new employee(
            employeeDto.getId(),
            employeeDto.getFirstName(),
            employeeDto.getLastName(),
            employeeDto.getEmail()
        );
    }
 

}
