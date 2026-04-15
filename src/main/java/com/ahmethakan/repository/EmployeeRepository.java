package com.ahmethakan.repository;

import com.ahmethakan.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employeeList;

    public List<Employee> getAllEmployeeList() {

        return employeeList;
    }

    public Employee getEmployeeById(String id) {

        Employee findEmployee = null;
        for (Employee employee: employeeList) {

            if (id.equals(employee.getId())) {
                findEmployee = employee;
                break;
            }
        }

        return findEmployee;
    }

    public List<Employee> getEmployeeWithParams(String name, String lastname) {
        List<Employee> employeeWithParams = new ArrayList<>();

        if (name == null && lastname == null) {
            return employeeList;
        }

        for(Employee  employee: employeeList) {
            if( name != null && lastname != null) {
                if(employee.getName().equalsIgnoreCase(name) && employee.getLastname().equalsIgnoreCase(lastname)) {
                    employeeWithParams.add(employee);
                }
            }

            if(name != null && lastname== null) {
                if (employee.getName().equalsIgnoreCase(name)) {
                    employeeWithParams.add(employee);
                }
            }

            if(name==null && lastname!= null) {
                if (employee.getLastname().equalsIgnoreCase(lastname)) {
                    employeeWithParams.add(employee);
                }
            }
        }

        return employeeWithParams;
    }

}
