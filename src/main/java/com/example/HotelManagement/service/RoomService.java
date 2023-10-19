package com.example.HotelManagement.service;

import com.example.HotelManagement.model.Room;
import com.example.HotelManagement.repo.IRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    IRoomRepo roomRepo;

    public String addRoom(Room newRoom) {

        roomRepo.save(newRoom);
        return "room added";

    }

    public List<Room> getRooms() {

        return (List<Room>) roomRepo.findAll();
    }
}
