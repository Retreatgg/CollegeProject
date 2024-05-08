package com.example.college.model;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SatisfactionRating {

    private Long id;
    private String nameOfTheStructuralUnit;
    private Boolean isEmployeeOfTheAdministration;
    private String academicTitle;
    private LocalDateTime dateOfPassage;

}
