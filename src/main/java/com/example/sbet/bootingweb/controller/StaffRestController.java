package com.example.sbet.bootingweb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sbet.bootingweb.models.Staff;
import com.example.sbet.bootingweb.service.StaffService;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {
	
	private final StaffService staffService;

	public StaffRestController(StaffService staffService) {
		super();
		this.staffService = staffService;
	}
	
	@GetMapping
	public List<Staff> getStaff(){
		return staffService.getAllStaff();
	}

}
