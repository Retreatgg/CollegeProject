package com.example.college.service.impl;

import com.example.college.dao.EmployerAssessmentDao;
import com.example.college.dto.EmployerAssessmentCreateDto;
import com.example.college.model.EmployerAssessment;
import com.example.college.service.EmployerAssessmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class EmployerAssessmentServiceImpl implements EmployerAssessmentService {

    private final EmployerAssessmentDao employerAssessmentDao;

    @Override
    public void createEmployerAssessment(EmployerAssessmentCreateDto employerAssessmentCreateDto) {
        EmployerAssessment assessment = new EmployerAssessment();

        assessment.setEducationalPrograms(employerAssessmentCreateDto.getEducationalPrograms());
        assessment.setStartYearCooperation(employerAssessmentCreateDto.getStartYearCooperation());
        assessment.setDateOfPassage(LocalDateTime.now());

        employerAssessmentDao.createEmployerAssessment(assessment);
    }
}
