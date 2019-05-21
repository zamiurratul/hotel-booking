package com.zamiur.ratul.hotel.controller;

import com.zamiur.ratul.hotel.service.HotelBookingService;
import org.springframework.stereotype.Controller;

@Controller
public class HotelBookingController {

    private final HotelBookingService hotelBookingService;

    public HotelBookingController(HotelBookingService hotelBookingService){
        this.hotelBookingService = hotelBookingService;
    }
}
