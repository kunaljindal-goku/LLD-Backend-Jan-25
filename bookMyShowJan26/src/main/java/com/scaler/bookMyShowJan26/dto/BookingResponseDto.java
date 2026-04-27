package com.scaler.bookMyShowJan26.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookingResponseDto {

    private int amount;
    private ResponseStatus responseStatus;
    private int bookingId;

}
