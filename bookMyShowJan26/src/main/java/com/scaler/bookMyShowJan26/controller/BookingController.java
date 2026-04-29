package com.scaler.bookMyShowJan26.controller;

import com.scaler.bookMyShowJan26.dto.BookingRequestDto;
import com.scaler.bookMyShowJan26.dto.BookingResponseDto;
import com.scaler.bookMyShowJan26.dto.ResponseStatus;
import com.scaler.bookMyShowJan26.models.Booking;
import com.scaler.bookMyShowJan26.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.awt.print.Book;

@Controller
public class BookingController {

    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    
    public BookingResponseDto bookTicket(BookingRequestDto request) {
        BookingResponseDto response = new BookingResponseDto();
        try {
            Booking booking = bookingService.bookTicket(
                    request.getShowId(),
                    request.getShowSeatIds(),
                    request.getUserId());
            response.setBookingId(booking.getId());
            response.setAmount(booking.getAmount());
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            response.setResponseStatus(ResponseStatus.FAILURE);
        }
        return response;
    }
}
