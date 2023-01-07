package com.springmongoapp.springmongoapp.repository;

import com.springmongoapp.springmongoapp.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department, String> {

    Department findByDepartmentName(String departmentName);
}
