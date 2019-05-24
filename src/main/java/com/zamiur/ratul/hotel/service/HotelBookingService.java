package com.zamiur.ratul.hotel.service;

import com.zamiur.ratul.hotel.model.dto.BookingData;
import com.zamiur.ratul.hotel.model.entity.Booking;
import com.zamiur.ratul.hotel.repository.BookingRepository;
import com.zamiur.ratul.hotel.utils.DateUtils;
import com.zamiur.ratul.hotel.utils.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class HotelBookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public HotelBookingService(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    public List<BookingData> getAllBookings(){

        List<BookingData> bookingDataList = new LinkedList<>();
        List<Booking> bookingList = bookingRepository.findAll();

        bookingList.forEach(booking -> {
            bookingDataList.add(new BookingData(booking));
        });

        return bookingDataList;
    }

    public Boolean saveBooking(){
        Booking booking = new Booking();
        booking.setCustomerName("Customer " + NumberUtils.getRandomIntegerBetweenRange(1, 100));
        booking.setCustomerAddress("Dhaka");
        booking.setRoomNumber("Room_" + NumberUtils.getRandomIntegerBetweenRange(101, 999));
        booking.setBookingDate(new Date(DateUtils.getRandomDate().getTime()));
        bookingRepository.save(booking);

        //TODO: how to know if saved without error
        if(booking.getId() != 0){
            return true;
        }
        return false;
    }

}
