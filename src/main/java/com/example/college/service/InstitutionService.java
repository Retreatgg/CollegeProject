package com.example.college.service;

import com.example.college.dto.InstitutionDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InstitutionService {

    List<InstitutionDto> getInstitutes();
    InstitutionDto getInstituteByName(String name);
}
