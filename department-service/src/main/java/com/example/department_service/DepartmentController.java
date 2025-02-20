package com.example.department_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    private final EmployeeServiceClient employeeServiceClient;

    public DepartmentController(EmployeeServiceClient employeeServiceClient) {
        this.employeeServiceClient = employeeServiceClient;
    }
    @GetMapping("/{employeeId}")
    public String getEmployeeDepartment(@PathVariable String employeeId) {
        Employee employee = employeeServiceClient.getEmployeeById(employeeId);
        return "Employee " + employee.getName() + " works in the " + employee.getDepartment() + " department.";
    }
}
