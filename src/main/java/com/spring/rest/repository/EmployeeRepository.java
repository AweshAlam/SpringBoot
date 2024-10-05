package com.spring.rest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.spring.rest.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
