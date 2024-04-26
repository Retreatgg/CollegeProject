package com.example.college.service;

import com.example.college.dto.UserDto;
import com.example.college.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUserByEmail(String email);
    Boolean passwordCheck(String firstPassword, String secondPassword);
    void loginUser(UserDto user);
}
