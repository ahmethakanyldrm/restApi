package com.ahmethakan.controller;

import com.ahmethakan.model.Employee;
import com.ahmethakan.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/list")
    public List<Employee> getAllEmployeeList() {
       return employeeService.getAllEmployeeList();
    }

    @GetMapping(path = "/list/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id", required = true) String id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping(path = "/with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name = "name", required = false) String name,
                                                @RequestParam(name= "lastname", required = false) String lastname) {
        // System.out.println(name + " " + lastname);
        return employeeService.getEmployeeWithParams(name,lastname);
    }

}
