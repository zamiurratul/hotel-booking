package com.zamiur.ratul.hotel.model.entity;

import javax.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "BOOKING")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CUSTOMER_NAME", length=100)
    private String customerName;

    @Column(name = "CUSTOMER_ADDRESS", length=100)
    private String customerAddress;

    @Column(name = "BOOKING_DATE")
    private Date bookingDate;

    @Column(name = "ROOM_NUMBER", length=100)
    private String roomNumber;
}
