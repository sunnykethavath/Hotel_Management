package com.example.HotelManagement.repo;

import com.example.HotelManagement.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoomRepo extends JpaRepository<Room,Integer> {
}
