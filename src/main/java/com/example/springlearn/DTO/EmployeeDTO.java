package com.example.springlearn.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class EmployeeDTO {
    private Long id;
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private Integer deptId;
}


