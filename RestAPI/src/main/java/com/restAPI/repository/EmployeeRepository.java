package com.restAPI.repository;

import org.springframework.data.repository.CrudRepository;

import com.restAPI.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
