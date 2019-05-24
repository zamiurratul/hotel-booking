package com.zamiur.ratul.hotel.repository;

import com.zamiur.ratul.hotel.model.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Booking findByBookingDate(Date date);
}
