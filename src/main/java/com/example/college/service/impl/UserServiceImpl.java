package com.example.college.service.impl;

import com.example.college.dto.UserDto;
import com.example.college.model.User;
import com.example.college.repository.UserRepository;
import com.example.college.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final PasswordEncoder encoder;


    @Override
    public User getUserByEmail(String email) {
        return repository.findByEmail(email)
                .orElseThrow(() -> new NoSuchElementException(("User is not found")));
    }

    public Boolean passwordCheck(String firstPassword, String secondPassword) {
        return encoder.encode(firstPassword)
                .equals(encoder.encode(secondPassword));
    }

    @Override
    public void loginUser(UserDto user) {
        User userWithData = getUserByEmail(user.getEmail());

        if (passwordCheck(user.getPassword(), userWithData.getPassword())) {

        }
    }
}
