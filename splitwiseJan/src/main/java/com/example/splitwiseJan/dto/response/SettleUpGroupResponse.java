package com.example.splitwiseJan.dto.response;

import com.example.splitwiseJan.models.Expense;
import com.example.splitwiseJan.models.ExpenseType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SettleUpGroupResponse {

    private ResponseStatus status;
    private String message;
    private List<Transaction> transactions;
}
