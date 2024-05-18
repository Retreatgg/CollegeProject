package com.example.college.service;

import com.example.college.dto.TeacherThroughStudentsCreateDto;
import com.example.college.model.TeacherThroughStudents;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface TeacherThroughStudentsService {

    void createTeacherThroughStudents(TeacherThroughStudentsCreateDto students);

    List<String> getStaticColumn(String columnName);

    List<Map<String, Object>> getStaticWithCount(String columnName);
}
