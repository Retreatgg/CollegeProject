package com.example.college.controller;


import com.example.college.dao.TeacherThroughStudentsDao;
import com.example.college.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("admin")
public class AdminController {

    private final TeacherThroughStudentsDao teacherThroughStudentsDao;

    @GetMapping("auth")
    public String auth() {
        return "";
    }
}
