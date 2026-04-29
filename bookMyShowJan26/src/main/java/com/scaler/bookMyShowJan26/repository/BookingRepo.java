package com.scaler.bookMyShowJan26.repository;

import com.scaler.bookMyShowJan26.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends JpaRepository<Booking,Integer> {
}
