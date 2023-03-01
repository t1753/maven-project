package com.restAPI.dto.service;

import com.restAPI.dto.DepartmentDTO;
import com.restAPI.exception.restAPIException;

public interface DepartmentService {
	public Integer addDepartment(DepartmentDTO department) throws restAPIException;
}
