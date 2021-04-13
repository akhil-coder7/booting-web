package com.example.sbet.bootingweb.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbet.bootingweb.models.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
