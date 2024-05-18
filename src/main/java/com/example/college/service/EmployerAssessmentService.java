package com.example.college.service;

import com.example.college.dto.EmployerAssessmentCreateDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service

public interface EmployerAssessmentService {

    void createEmployerAssessment(EmployerAssessmentCreateDto employerAssessmentCreateDto);


    List<String> getStaticColumn(String columnName);

    List<Map<String, Object>> getStaticWithCount(String columnName);
}
