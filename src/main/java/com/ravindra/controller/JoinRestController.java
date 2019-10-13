package com.ravindra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravindra.dto.DeptEmpDto;
import com.ravindra.service.JoinService;

@RestController
public class JoinRestController {
	@Autowired
	private JoinService joinService;

	@GetMapping("/dept/employees/left")
	public ResponseEntity<List<DeptEmpDto>> getDeptEmployeesLeftJoin() {
		return new ResponseEntity<List<DeptEmpDto>>(joinService.getDeptEmployeesLeftJoin(), HttpStatus.OK);
	}

	@GetMapping("/dept/employees/right")
	public ResponseEntity<List<DeptEmpDto>> getDeptEmployeesRightJoin() {
		return new ResponseEntity<List<DeptEmpDto>>(joinService.getDeptEmployeesRightJoin(), HttpStatus.OK);
	}

	@GetMapping("/dept/employees/inner")
	public ResponseEntity<List<DeptEmpDto>> getDeptEmployeesInnerJoin() {
		return new ResponseEntity<List<DeptEmpDto>>(joinService.getDeptEmployeesInnerJoin(), HttpStatus.OK);
	}

	@GetMapping("/dept/employees/cross")
	public ResponseEntity<List<DeptEmpDto>> getDeptEmployeesCrossJoin() {
		return new ResponseEntity<List<DeptEmpDto>>(joinService.getDeptEmployeesCrossJoin(), HttpStatus.OK);
	}
}