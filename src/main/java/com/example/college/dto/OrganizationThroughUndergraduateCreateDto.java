package com.example.college.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrganizationThroughUndergraduateCreateDto {

    private InstitutionDto institutionName;
    private String group;
    private FormOfEducationDto formOfEducation;
    private Integer course;

}
