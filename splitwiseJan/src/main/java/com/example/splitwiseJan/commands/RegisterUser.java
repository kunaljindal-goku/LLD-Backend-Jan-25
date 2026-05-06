package com.example.splitwiseJan.commands;

import org.springframework.stereotype.Component;

@Component
public class RegisterUser implements Command{
    @Override
    public boolean match(String input) {

        // logic comes
        // if command matches
        return false;
    }

    @Override
    public void execute(String input) {
        // usercontroller
    }
}
