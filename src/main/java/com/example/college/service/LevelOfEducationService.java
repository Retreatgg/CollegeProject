package com.example.college.service;

import com.example.college.dto.LevelOfEducationDto;
import com.example.college.model.LevelOfEducation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LevelOfEducationService {

    List<LevelOfEducationDto> getLevels();

    LevelOfEducationDto getLevel(String name);
}
