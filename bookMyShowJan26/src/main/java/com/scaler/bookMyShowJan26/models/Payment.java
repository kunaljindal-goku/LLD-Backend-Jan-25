package com.scaler.bookMyShowJan26.models;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.Date;

public class Payment {

    private Double amount;

    private Date paymentDate;

    @Enumerated(value = EnumType.STRING)
    private PaymentGateway paymentGateway;

    @Enumerated(value = EnumType.ORDINAL)
    private PaymentStatus paymentStatus;

    @Enumerated(value = EnumType.STRING)
    private PaymentMode paymentMode;

    private String refNumber;
}
