package com.example.HotelManagement.controller;

import com.example.HotelManagement.model.Room;
import com.example.HotelManagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    @PostMapping("room")
    public String addRoom(@RequestBody Room newRoom)
    {
        return roomService.addRoom(newRoom);
    }

    @GetMapping("rooms")
    public
    List<Room> getRooms()
    {
        return roomService.getRooms();
    }

}
