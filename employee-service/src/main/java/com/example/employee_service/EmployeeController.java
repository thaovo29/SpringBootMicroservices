package com.example.employee_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return new Employee(id, "Joe", "Engineering");
    }
}
