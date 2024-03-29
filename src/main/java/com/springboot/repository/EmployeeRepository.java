package com.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
