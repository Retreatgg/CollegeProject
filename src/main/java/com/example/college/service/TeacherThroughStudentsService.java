package com.example.college.service;

import com.example.college.dto.TeacherThroughStudentsCreateDto;
import com.example.college.model.TeacherThroughStudents;
import org.springframework.stereotype.Service;

@Service
public interface TeacherThroughStudentsService {

    void createTeacherThroughStudents(TeacherThroughStudentsCreateDto students);
}
