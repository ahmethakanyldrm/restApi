package com.ahmethakan.services;

import com.ahmethakan.model.Employee;
import com.ahmethakan.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList() {
      return employeeRepository.getAllEmployeeList();

    }

    public Employee getEmployeeById(String id) {
        return employeeRepository.getEmployeeById(id);
    }

    public  List<Employee> getEmployeeWithParams(String name, String lastname) {
        return employeeRepository.getEmployeeWithParams(name,lastname);
    }


}
