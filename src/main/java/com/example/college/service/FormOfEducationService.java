package com.example.college.service;

import com.example.college.dto.FormOfEducationDto;
import com.example.college.model.FormOfEducation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FormOfEducationService {

    List<FormOfEducationDto> getFormEducations();
    FormOfEducationDto getEducationByName(String name);
}
