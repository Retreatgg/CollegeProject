package com.example.college.service.impl;

import com.example.college.dao.EmployerAssessmentDao;
import com.example.college.dto.EmployerAssessmentCreateDto;
import com.example.college.model.EmployerAssessment;
import com.example.college.service.EmployerAssessmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployerAssessmentServiceImpl implements EmployerAssessmentService {

    private final EmployerAssessmentDao employerAssessmentDao;

    @Override
    public void createEmployerAssessment(EmployerAssessmentCreateDto employerAssessmentCreateDto) {
        EmployerAssessment assessment = new EmployerAssessment();

        assessment.setEducationalPrograms(employerAssessmentCreateDto.getEducationalPrograms());
        assessment.setStartYearCooperation(employerAssessmentCreateDto.getStartYearCooperation());

        employerAssessmentDao.createEmployerAssessment(assessment);
    }
}
