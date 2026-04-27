package com.scaler.bookMyShowJan26.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{

    private String seatName;

    private int rowVal;

    private int columnVal;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;
}
