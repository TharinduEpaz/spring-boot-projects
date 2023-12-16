package com.example.springlearn.service;

import com.example.springlearn.DAO.EmployeeDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeDAO employeeDAO;
    @Autowired
    public EmployeeService(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }
}
