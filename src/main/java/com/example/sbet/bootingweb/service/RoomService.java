package com.example.sbet.bootingweb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sbet.bootingweb.data.RoomRepository;
import com.example.sbet.bootingweb.models.Room;

@Service
public class RoomService {
	
	private final RoomRepository roomRepository;
	
	public RoomService(RoomRepository roomRepository) {
		super();
		this.roomRepository = roomRepository;
	}

	public List<Room> getAllRooms() {
		return roomRepository.findAll();
	}

}
