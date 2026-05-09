package com.example.splitwiseJan.strategy;

import com.example.splitwiseJan.dto.response.Transaction;
import com.example.splitwiseJan.models.Expense;

import java.util.List;

public class NormalSettleUpStrategy implements SettleUpStrategy{
    @Override
    public List<Transaction> settleUp(List<Expense> expenses) {
        return List.of();
    }
}
