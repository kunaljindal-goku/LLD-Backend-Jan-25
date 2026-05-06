package com.example.splitwiseJan;

import com.example.splitwiseJan.commands.Command;
import com.example.splitwiseJan.commands.CommandExecutor;
import com.example.splitwiseJan.commands.RegisterUser;
import com.example.splitwiseJan.commands.SettleUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SplitwiseJanApplication implements CommandLineRunner {

	@Autowired
	CommandExecutor commandExecutor;

	public static void main(String[] args) {
		SpringApplication.run(SplitwiseJanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		String input = "REGISTER name passeord email";
//		String[] words = input.split(" ");
//
//		if(words[0].equalsIgnoreCase("register")) {
//			// usercontroller.resgister(words[1]
//		}
//		else if(words[0].equalsIgnoreCase("add expense")) {
//			// expesencontroller.addExpense()
//		}


		//String input = sc.next();
//		commandExecutor.execute(input);

	}
}
