package com.example.ems.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

// JPA entity mapped to 'employees' database table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class employee {
    // Auto-generated primary key
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    
    // Required field, maps to first_name column
    @Column(name = "first_name", nullable = false)
    private String firstName;
    
    // Optional field
    @Column(name = "last_name")
    private String lastName;
    
    // Email must be unique across all employees
    @Column(name = "email_id", unique = true)
    private String email;
    

    
}
