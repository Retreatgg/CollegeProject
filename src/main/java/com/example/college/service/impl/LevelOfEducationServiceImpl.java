package com.example.college.service.impl;

import com.example.college.dto.LevelOfEducationDto;
import com.example.college.model.LevelOfEducation;
import com.example.college.repository.LevelOfEducationRepository;
import com.example.college.service.LevelOfEducationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LevelOfEducationServiceImpl implements LevelOfEducationService {

    private final LevelOfEducationRepository repository;

    @Override
    public List<LevelOfEducationDto> getLevels() {
        List<LevelOfEducationDto> dtos = new ArrayList<>();

        List<LevelOfEducation> levelOfEducations = repository.findAll();

        levelOfEducations.forEach(level -> {
            dtos.add(LevelOfEducationDto.builder()
                    .name(level.getName())
                    .build());
        });

        return dtos;
    }

    @Override
    public LevelOfEducationDto getLevel(String name) {
        Optional<LevelOfEducation> levelOfEducationOptional = repository.findById(name);
        LevelOfEducation levelOfEducation = levelOfEducationOptional.orElseThrow();

        return LevelOfEducationDto.builder()
                .name(levelOfEducation.getName())
                .build();
    }
}
