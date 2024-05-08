package com.example.college.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class OrganizationThroughStudents {

    private Long id;
    private String institutionName;
    private String group;
    private String formOfEducation;
    private String levelOfStudy;
    private Integer course;
    private LocalDateTime dateOfPassage;

}
