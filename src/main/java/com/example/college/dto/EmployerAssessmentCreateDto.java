package com.example.college.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class EmployerAssessmentCreateDto {

    private String educationalPrograms;
    private Date startYearCooperation;

}
