package com.example.college.service;

import com.example.college.dto.EmployerAssessmentCreateDto;
import org.springframework.stereotype.Service;

@Service

public interface EmployerAssessmentService {

    void createEmployerAssessment(EmployerAssessmentCreateDto employerAssessmentCreateDto);


}
