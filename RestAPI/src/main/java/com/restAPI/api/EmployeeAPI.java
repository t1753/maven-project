package com.restAPI.api;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restAPI.dto.EmployeeDTO;
import com.restAPI.dto.service.EmployeeService;
import com.restAPI.exception.restAPIException;

@RestController
public class EmployeeAPI {
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private Environment environment;
	Log LOGGER = LogFactory.getLog(EmployeeAPI.class);
	@GetMapping(value="/employees")
	public ResponseEntity<List<EmployeeDTO>> getAllEmployees() throws restAPIException{
		List<EmployeeDTO> employeeList = employeeService.getAllEmployees();
		String success = environment.getProperty("API.Retrieved_Success");
		LOGGER.info(success);
		return new ResponseEntity<>(employeeList, HttpStatus.OK);
	}
	@PostMapping(value="/employee")
	public ResponseEntity<String> addEmployee(@RequestBody EmployeeDTO employee) throws restAPIException{
		Integer employeeId = employeeService.addEmployee(employee);
		String success = environment.getProperty("API.Insertion_Success") + employeeId;
		LOGGER.info(success);
		return new ResponseEntity<>(success,HttpStatus.CREATED);
	}

}
