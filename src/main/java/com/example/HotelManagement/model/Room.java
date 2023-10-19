package com.example.HotelManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Room {

    @Id
    private Integer roomId;
    private Integer roomNumber;
    private Type roomType;
    @Column(name = "available")
    private boolean roomAvailable;
    private double roomPrice;
}
