package com.example.splitwiseJan.commands;

import com.example.splitwiseJan.controller.SettleUpController;
import com.example.splitwiseJan.dto.request.SettleUpGroupRequestDto;
import com.example.splitwiseJan.dto.response.SettleUpGroupResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SettleUp implements Command{

    private SettleUpController settleUpController;
    private final String COMMAND_NAME = "SettleUp";

    @Autowired
    public SettleUp(SettleUpController settleUpController) {
        this.settleUpController = settleUpController;
    }

    @Override
    public boolean match(String input) {
        String[] commandFragments = input.split(" ");
        if(commandFragments[0].equalsIgnoreCase(COMMAND_NAME)) {
            return true;
        }
        return false;
    }

    @Override
    public void execute(String input) {
        String[] commandFragments = input.split(" ");
        long id = Long.parseLong(commandFragments[1]);
        SettleUpGroupRequestDto requestDto = new SettleUpGroupRequestDto();
        requestDto.setGroupId(id);

        SettleUpGroupResponse response = settleUpController.settleUpGroup(requestDto);
        System.out.println(response.getMessage());
        System.out.println(response.getTransactions());
    }
}
