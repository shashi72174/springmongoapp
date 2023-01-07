package com.springmongoapp.springmongoapp.service;

import com.springmongoapp.springmongoapp.entity.Department;
import com.springmongoapp.springmongoapp.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
