package com.scaler.bookMyShowJan26.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DialectOverride;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket {

    @ManyToOne
    private User user;

    @OneToMany
    private List<ShowSeat> showSeats;

    private Date bookingDate;

    @OneToMany
    private List<Payment> payments;

    @ManyToOne
    private Show show;

    @Enumerated(value = EnumType.STRING)
    private TicketStatus ticketStatus;
}
