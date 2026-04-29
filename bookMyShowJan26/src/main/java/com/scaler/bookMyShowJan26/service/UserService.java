package com.scaler.bookMyShowJan26.service;

import com.scaler.bookMyShowJan26.dto.SignupRequestDto;
import com.scaler.bookMyShowJan26.models.User;
import com.scaler.bookMyShowJan26.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signup(String name,
                       String email,
                       String password) {

        Optional<User> userOptional = userRepository.findByEmail(email);
        if(userOptional.isPresent()) {
            throw new RuntimeException("Email already exists: "+email);
        }

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        User savedUser = userRepository.save(user);
        return savedUser;


    }
}
