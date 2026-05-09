package com.example.splitwiseJan.strategy;

import com.example.splitwiseJan.dto.response.Transaction;
import com.example.splitwiseJan.models.Expense;

import java.util.List;

public interface SettleUpStrategy {

    List<Transaction> settleUp(List<Expense> expenses);
}
