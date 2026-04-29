package com.scaler.bookMyShowJan26.controller;

import com.scaler.bookMyShowJan26.dto.ResponseStatus;
import com.scaler.bookMyShowJan26.dto.SignupRequestDto;
import com.scaler.bookMyShowJan26.dto.SignupResponseDto;
import com.scaler.bookMyShowJan26.models.User;
import com.scaler.bookMyShowJan26.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignupResponseDto signUp(SignupRequestDto signupRequestDto) {
        SignupResponseDto signupResponseDto = new SignupResponseDto();

        try {
            User user = userService.signup(signupRequestDto.getName(),
                    signupRequestDto.getEmail(),
                    signupRequestDto.getPassword());
            signupResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
            signupResponseDto.setUserId(user.getId());
        } catch (Exception e) {
            signupResponseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return signupResponseDto;
    }
}
