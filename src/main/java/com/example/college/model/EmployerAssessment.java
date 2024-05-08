package com.example.college.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;


@Getter
@Setter
public class EmployerAssessment {

    private Long id;
    private String educationalPrograms;
    private Date startYearCooperation;
    private LocalDateTime dateOfPassage;

}
