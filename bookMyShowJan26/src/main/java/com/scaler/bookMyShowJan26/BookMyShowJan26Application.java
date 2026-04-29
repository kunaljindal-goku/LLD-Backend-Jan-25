package com.scaler.bookMyShowJan26;

import com.scaler.bookMyShowJan26.controller.UserController;
import com.scaler.bookMyShowJan26.dto.SignupRequestDto;
import com.scaler.bookMyShowJan26.dto.SignupResponseDto;
import com.scaler.bookMyShowJan26.models.BaseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowJan26Application implements CommandLineRunner {


	@Autowired
	UserController userController;

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowJan26Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		SignupRequestDto requestDto = new SignupRequestDto();
		requestDto.setName("Virat");
		requestDto.setEmail("viko18@gmail.com");
		requestDto.setPassword("virat123");

		SignupResponseDto response = userController.signUp(requestDto);
		System.out.println(response.getResponseStatus());
		System.out.println(response.getUserId());
	}
}
