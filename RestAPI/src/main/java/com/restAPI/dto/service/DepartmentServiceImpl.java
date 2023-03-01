package com.restAPI.dto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restAPI.dto.DepartmentDTO;
import com.restAPI.entity.Department;
import com.restAPI.exception.restAPIException;
import com.restAPI.repository.DepartmentRepository;

import jakarta.transaction.Transactional;

@Service(value="departmentService")
@Transactional
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired 
	DepartmentRepository departmentRepository;
	@Override
	//This method is used to add department object to the database from the department api method.
	public Integer addDepartment(DepartmentDTO department) throws restAPIException {
		Department departmentEntity = new Department();
		departmentEntity.setDepartmentId(department.getDepartmentId());
		departmentEntity.setDepartmentName(department.getDepartmentName());
		departmentEntity.setDepartmentNumber(department.getDepartmentNumber());
		Department departmentEntity1 = departmentRepository.save(departmentEntity);
		return departmentEntity1.getDepartmentId();
	}
	

}
