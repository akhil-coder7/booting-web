package com.example.sbet.bootingweb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.sbet.bootingweb.data.StaffRepository;
import com.example.sbet.bootingweb.models.Position;
import com.example.sbet.bootingweb.models.Staff;

@Service
public class StaffService {
	
	private final StaffRepository staffRepository;
	
	public StaffService(StaffRepository staffRepository) {
		super();
		this.staffRepository = staffRepository;
	}

	public List<Staff> getAllStaff(){
		return staffRepository.findAll();
	}

}
