package com.scaler.bookMyShowJan26.dto;

import com.scaler.bookMyShowJan26.models.ShowSeat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookingRequestDto {

    private int userId;
    private int showId;
    private List<Integer> showSeatIds;
}
