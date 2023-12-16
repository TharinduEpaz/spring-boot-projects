package com.example.springlearn.DAO;

import com.example.springlearn.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<Employee,Long> {

}
