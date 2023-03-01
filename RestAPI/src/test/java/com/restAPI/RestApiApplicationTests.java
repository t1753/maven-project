package com.restAPI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.restAPI.dto.EmployeeDTO;
import com.restAPI.dto.service.EmployeeService;
import com.restAPI.entity.Employee;
import com.restAPI.exception.restAPIException;
import com.restAPI.repository.EmployeeRepository;


@SpringBootTest
class RestApiApplicationTests {
	@MockBean
	private EmployeeService employeeService;

	@Test
	public void getAllEmployeesTest() throws restAPIException {
		when(employeeService.getAllEmployees()).thenReturn(Stream
				.of(new EmployeeDTO(),new EmployeeDTO()).collect(Collectors.toList()));
		assertEquals(2,employeeService.getAllEmployees().size());
				
	}

}
