package com.ahmethakan.config;

import com.ahmethakan.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("1","Ahmet","Yıldırım"));
        employeeList.add(new Employee("2","Kseniia", ""));

        employeeList.add(new Employee("3","Hakan","Yıldırım"));
        employeeList.add(new Employee("4","Kseniia", ""));

        return employeeList;
    }
}
