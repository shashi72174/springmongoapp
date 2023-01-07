package com.springmongoapp.springmongoapp.repository;

import com.springmongoapp.springmongoapp.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
