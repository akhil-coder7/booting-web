package com.example.sbet.bootingweb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sbet.bootingweb.models.Room;
import com.example.sbet.bootingweb.service.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
	
	private final RoomService roomService;

	public RoomRestController(RoomService roomService) {
		this.roomService = roomService;
	}
	
	@GetMapping
	public List<Room> getRooms(){
		return roomService.getAllRooms();
	}

}
