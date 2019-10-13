package com.ravindra.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class DeptEmpDto {
	private String empDept;
	private String empName;
	private String empEmail;
	private String empAddress;
}