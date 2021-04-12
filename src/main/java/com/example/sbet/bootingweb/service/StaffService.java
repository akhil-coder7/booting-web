package com.example.sbet.bootingweb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.sbet.bootingweb.models.Position;
import com.example.sbet.bootingweb.models.Staff;

@Service
public class StaffService {
	
	private static final List<Staff> staff = new ArrayList<>();
	
	static {
		staff.add(new Staff(UUID.randomUUID().toString(), "John", "Smith", Position.CONCIERGE));
		staff.add(new Staff(UUID.randomUUID().toString(), "Jim", "Stone", Position.FRONT_DESK));
		staff.add(new Staff(UUID.randomUUID().toString(), "Sam", "Strike", Position.HOUSEKEEPING));
		staff.add(new Staff(UUID.randomUUID().toString(), "Stacey", "Long", Position.SECURITY));
	}
	
	public List<Staff> getAllStaff(){
		return staff;
	}

}
