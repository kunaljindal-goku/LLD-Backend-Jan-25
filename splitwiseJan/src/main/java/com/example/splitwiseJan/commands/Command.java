package com.example.splitwiseJan.commands;

public interface Command {

    boolean match(String input);

    void execute(String input);
}
