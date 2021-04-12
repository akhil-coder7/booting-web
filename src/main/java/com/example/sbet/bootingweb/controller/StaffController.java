package com.example.sbet.bootingweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sbet.bootingweb.service.StaffService;

@Controller
@RequestMapping("/staff")
public class StaffController {
	
	private final StaffService staffService;

	public StaffController(StaffService staffService) {
		super();
		this.staffService = staffService;
	}
	
	@GetMapping
	public String getstaff(Model model) {
		model.addAttribute("staff", staffService.getAllStaff());
		return "staff";
	}

}
