package com.springmongoapp.springmongoapp.controller;

import com.springmongoapp.springmongoapp.config.Test;
import com.springmongoapp.springmongoapp.entity.Employee;
import com.springmongoapp.springmongoapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private Test test;

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("{id}")
    public Employee updateEmployee(@RequestBody Employee  employee, @PathVariable String id) {
        return employeeService.updateEmployee(employee, id);
    }

    @GetMapping("{id}")
    public Employee getEmployee(@PathVariable String id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<Employee> getEmployee(){
        System.out.println(test.getName());
        return employeeService.getEmployees();

    }

}
