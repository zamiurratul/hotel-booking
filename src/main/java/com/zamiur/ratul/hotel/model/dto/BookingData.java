package com.zamiur.ratul.hotel.model.dto;

import com.zamiur.ratul.hotel.model.entity.Booking;
import lombok.Data;

import java.util.Date;

@Data
public class BookingData {
    private String customerName;
    private String customerAddress;
    private Date bookingDate;
    private String roomNumber;

    public BookingData(Booking booking){
        this.customerName = booking.getCustomerName();
        this.customerAddress = booking.getCustomerAddress();
        this.bookingDate = booking.getBookingDate();
        this.roomNumber = booking.getRoomNumber();
    }
}
