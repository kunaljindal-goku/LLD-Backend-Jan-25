package com.example.splitwiseJan.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {

    private String paidBy;
    private String paidTo;
    private int amount;
}
