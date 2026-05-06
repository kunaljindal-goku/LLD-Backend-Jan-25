package com.example.splitwiseJan.commands;

import org.springframework.stereotype.Component;

@Component
public class SettleUp implements Command{
    @Override
    public boolean match(String input) {
        return false;
    }

    @Override
    public void execute(String input) {

    }
}
