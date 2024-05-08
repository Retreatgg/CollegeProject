package com.example.college.model;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class OrganizationThroughUndergraduate {

    private Long id;
    private String institutionName;
    private String group;
    private String formOfEducation;
    private Integer course;
    private LocalDateTime dateOfPassage;

}
