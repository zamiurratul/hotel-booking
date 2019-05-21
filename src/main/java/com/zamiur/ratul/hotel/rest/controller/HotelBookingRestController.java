package com.zamiur.ratul.hotel.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HotelBookingRestController {

    @Autowired
    Environment environment;

    @RequestMapping(value = "/systemStatus", method = RequestMethod.GET)
    public String systemStatus(){
        String port = environment.getProperty("local.server.port");
        return "Hotel Booking System - Running at Port: " + port;
    }
}
