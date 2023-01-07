package com.springmongoapp.springmongoapp.service;

import com.springmongoapp.springmongoapp.entity.Employee;
import com.springmongoapp.springmongoapp.repository.DepartmentRepository;
import com.springmongoapp.springmongoapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public Employee saveEmployee(Employee employee) {
        employee.getDepartments().stream().forEach(department -> department.setId(departmentRepository.findByDepartmentName(department.getDepartmentName()).getId()));
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee, String id) {
        Employee emp = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("employee not found"));
        emp = employee;
        emp.setId(id);
        employee.getDepartments().stream().forEach(department -> department.setId(departmentRepository.findByDepartmentName(department.getDepartmentName()).getId()));
        return employeeRepository.save(emp);
    }

    public Employee getEmployeeById(String id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        return optional.isPresent() ? optional.get() : optional.orElseThrow(() -> new RuntimeException());
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
}
