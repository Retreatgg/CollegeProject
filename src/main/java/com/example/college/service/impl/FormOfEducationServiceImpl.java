package com.example.college.service.impl;

import com.example.college.dto.FormOfEducationDto;
import com.example.college.model.FormOfEducation;
import com.example.college.repository.FormOfEducationRepository;
import com.example.college.service.FormOfEducationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class FormOfEducationServiceImpl implements FormOfEducationService {

    private final FormOfEducationRepository formOfEducationRepository;

    @Override
    public List<FormOfEducationDto> getFormEducations() {
        List<FormOfEducation> formOfEducations = formOfEducationRepository.findAll();
        List<FormOfEducationDto> dtos = new ArrayList<>();

        formOfEducations.forEach(form -> {
            dtos.add(FormOfEducationDto.builder()
                            .name(form.getName())
                    .build());
        });

        return dtos;
    }

    @Override
    public FormOfEducationDto getEducationByName(String name) {
        Optional<FormOfEducation> formOfEducationOptional = formOfEducationRepository.findById(name);
        FormOfEducation formOfEducation = formOfEducationOptional.orElseThrow();

        return FormOfEducationDto.builder()
                .name(formOfEducation.getName())
                .build();
    }
}
