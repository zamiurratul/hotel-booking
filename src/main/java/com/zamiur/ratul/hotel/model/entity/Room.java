package com.zamiur.ratul.hotel.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ROOM")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ROOM_NUMBER")
    private String roomNumber;

    @Column(name = "BOOKED")
    private Boolean booked;
}
