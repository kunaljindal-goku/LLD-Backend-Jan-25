package com.example.splitwiseJan.commands;

import io.micrometer.observation.Observation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

@Component
@Scope("prototype")
public class CommandExecutor {

    private List<Command> commands;

    public CommandExecutor(SettleUp settleUp,
                           RegisterUser registerUser) {
        this.commands = new ArrayList<>();
        commands.add(settleUp);
        commands.add(registerUser);
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void execute(String input) {
        for(Command command: commands) {
            if(command.match(input)) {
                command.execute(input);
            }
        }
    }
}
