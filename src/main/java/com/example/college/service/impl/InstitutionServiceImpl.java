package com.example.college.service.impl;

import com.example.college.dao.InstitutionDao;
import com.example.college.dto.InstitutionDto;
import com.example.college.model.Institution;
import com.example.college.service.InstitutionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InstitutionServiceImpl implements InstitutionService {

    private final InstitutionDao institutionDao;

    @Override
    public List<InstitutionDto> getInstitutes() {
        List<Institution> institutions = institutionDao.getInstitutions();
        List<InstitutionDto> dtos = new ArrayList<>();

        institutions.forEach(e -> {
            dtos.add(InstitutionDto.builder()
                            .name(e.getName())
                    .build());
        });

        return dtos;
    }

    @Override
    public InstitutionDto getInstituteByName(String name) {
        Optional<Institution> institutionOptional = institutionDao.getInstituteByName(name);
        Institution institution = institutionOptional.orElseThrow();

        return InstitutionDto.builder()
                .name(institution.getName())
                .build();
    }
}
