package com.example.college.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrganizationThroughStudentsCreateDto {

    private InstitutionDto institutionName;
    private String group;
    private FormOfEducationDto formOfEducation;
    private LevelOfEducationDto levelOfStudy;
    private Integer course;

}
