package com.restAPI.dto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restAPI.dto.EmployeeDTO;
import com.restAPI.entity.Department;
import com.restAPI.entity.Employee;
import com.restAPI.exception.restAPIException;
import com.restAPI.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service(value="employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	//this method is used to get all employees from the database
	public List<EmployeeDTO> getAllEmployees() throws restAPIException {
		Iterable<Employee> employees = employeeRepository.findAll();
		
		List<EmployeeDTO> employee2 = new ArrayList<>();
		employees.forEach(employee ->{
			EmployeeDTO emp = new EmployeeDTO();
			emp.setEmployeeId(employee.getEmployeeId());
			emp.setFirstName(employee.getFirstName());
			emp.setLastName(employee.getLastName());
			emp.setJobLevelId(employee.getJobLevelId());
			emp.setDepartmentId(employee.getDepartmentId());
			emp.setEmailId(employee.getEmailId());
			emp.setManagerId(employee.getManagerId());
			employee2.add(emp);
		});
		if(employee2.isEmpty())
			throw new restAPIException("Service.Employees_Not_Found");
		return employee2;
	}
	@Override
	public Integer addEmployee(EmployeeDTO employee) throws restAPIException {
		Employee employeeEntity = new Employee();
		employeeEntity.setEmployeeId(employee.getEmployeeId());
		employeeEntity.setFirstName(employee.getFirstName());
		employeeEntity.setLastName(employee.getLastName());
		employeeEntity.setJobLevelId(employee.getJobLevelId());
		employeeEntity.setDepartmentId(employee.getDepartmentId());
		employeeEntity.setEmailId(employee.getEmailId());
		employeeEntity.setManagerId(employee.getManagerId());
		Employee employeeEntity1 = employeeRepository.save(employeeEntity);
		return employeeEntity1.getEmployeeId();
	}

}
