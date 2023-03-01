package com.restAPI.repository;

import org.springframework.data.repository.CrudRepository;

import com.restAPI.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department,Integer>{

}
