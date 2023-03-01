package com.restAPI.api;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.restAPI.dto.DepartmentDTO;
import com.restAPI.dto.service.DepartmentService;
import com.restAPI.exception.restAPIException;

@RestController
public class DepartmentAPI {
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private Environment environment;
	
	Log LOGGER = LogFactory.getLog(DepartmentAPI.class);
	
	@PostMapping(value="/departments")
	public ResponseEntity<String> addDepartment(@RequestBody DepartmentDTO department) throws restAPIException{
		Integer departmentId = departmentService.addDepartment(department);
		String success = environment.getProperty("API.Insertion_Successed") + departmentId;
		LOGGER.info(success);
		return new ResponseEntity<>(success,HttpStatus.CREATED);
	}

}
