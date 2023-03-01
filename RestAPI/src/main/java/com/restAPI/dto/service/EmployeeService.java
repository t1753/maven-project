package com.restAPI.dto.service;

import java.util.List;

import com.restAPI.dto.EmployeeDTO;
import com.restAPI.exception.restAPIException;

public interface EmployeeService {
	public Integer addEmployee(EmployeeDTO employee) throws restAPIException;
	public List<EmployeeDTO> getAllEmployees() throws restAPIException;
}
