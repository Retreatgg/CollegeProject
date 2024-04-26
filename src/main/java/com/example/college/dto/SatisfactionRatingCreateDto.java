package com.example.college.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SatisfactionRatingCreateDto {

    private String nameOfTheStructuralUnit;
    private Boolean isEmployeeOfTheAdministration;
    private String academicTitle;

}
