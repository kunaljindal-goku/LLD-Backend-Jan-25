package com.example.splitwiseJan.controller;

import com.example.splitwiseJan.dto.request.SettleUpGroupRequestDto;
import com.example.splitwiseJan.dto.response.ResponseStatus;
import com.example.splitwiseJan.dto.response.SettleUpGroupResponse;
import com.example.splitwiseJan.dto.response.Transaction;
import com.example.splitwiseJan.service.SettleUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.nio.file.Path;
import java.util.List;

@Controller
public class SettleUpController {

    private SettleUpService settleUpService;

    @Autowired
    public SettleUpController(SettleUpService settleUpService) {
        this.settleUpService = settleUpService;
    }

    public SettleUpGroupResponse settleUpGroup(SettleUpGroupRequestDto request) {
        SettleUpGroupResponse response = new SettleUpGroupResponse();
        try {
            List<Transaction> transactions = settleUpService.settleUpGroup(request.getGroupId());
            response.setTransactions(transactions);
            response.setStatus(ResponseStatus.SUCCESS);
            response.setMessage("Suggested transactions");
        }
        catch (Exception e) {
            response.setStatus(ResponseStatus.FAILURE);
            response.setMessage("Something went wrong");
        }
        return response;
    }
}
