package com.scaler.bookMyShowJan26.service;

import com.scaler.bookMyShowJan26.exceptions.UserNotFoundException;
import com.scaler.bookMyShowJan26.models.*;
import com.scaler.bookMyShowJan26.repository.BookingRepo;
import com.scaler.bookMyShowJan26.repository.ShowRepo;
import com.scaler.bookMyShowJan26.repository.ShowSeatRepository;
import com.scaler.bookMyShowJan26.repository.UserRepository;
import com.zaxxer.hikari.util.IsolationLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Book;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private UserRepository userRepository;
    private ShowRepo showRepo;
    private ShowSeatRepository showSeatRepository;
    private BookingRepo bookingRepo;

    @Autowired
    public BookingService(UserRepository userRepository,
                          ShowRepo showRepo,
                          ShowSeatRepository showSeatRepository,
                          BookingRepo bookingRepo) {
        this.userRepository = userRepository;
        this.showRepo = showRepo;
        this.showSeatRepository = showSeatRepository;
        this.bookingRepo = bookingRepo;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookTicket(int showId,
                              List<Integer> showSeatIds,
                              int userId) {

        // showid should exist
        // showseats id should exist and should not be blocked
        // userid should also exist;

        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isEmpty()) {
            throw new UserNotFoundException("Invalid userId: "+userId);
        }
        User currentUser = userOptional.get();

        Optional<Show> optionalShow = showRepo.findById(showId);
        if(optionalShow.isEmpty()) {
            throw new RuntimeException("Invalid ShowId: "+showId);
        }
        Show show = optionalShow.get();

        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatIds);
        for(ShowSeat showSeat: showSeats) {
            if(showSeat.getStatus().equals(ShowSeatStatus.BLOCKED)) {
                throw new RuntimeException("All requested seat are NOT available");
            }
        }

        List<ShowSeat> savedShowSeats = new ArrayList<>();

        for(ShowSeat showSeat: showSeats) {
            showSeat.setStatus(ShowSeatStatus.BLOCKED);
            showSeat.setBlockedAt(new Date());
            ShowSeat savedShowSeat = showSeatRepository.save(showSeat);
            savedShowSeats.add(savedShowSeat);
        }

        Booking booking = new Booking();
        booking.setUser(currentUser);
        booking.setShowSeats(savedShowSeats);
        booking.setBookingDate(new Date());
        booking.setPayments(new ArrayList<>());
       // booking.setAmount(pricingService.calculateAmount(savedShowSeats, show)
        // optional feature -> integrate after price calcualtion
        booking.setAmount(2000);
        booking.setShow(show);
        booking.setTicketStatus(TicketStatus.PENDING);

        bookingRepo.save(booking);
        return booking;

        // change showseats -> Blocked
        // save the status n the db

        // create booking
        // save the booking and return
    }
}
