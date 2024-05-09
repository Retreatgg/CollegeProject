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
    private Integer countCompletedInternship;
    private Integer countEmployed;
    private Integer countWorkingInTheirSpecialty;
    private Integer studentTraining;
    private Integer professionalTrainingGraduates;
    private Integer generalTheoreticalTraining;
    private Integer basicPracticalSkills;
    private Integer writtenAndOralLiteracy;
    private Integer abilityToAcquireNewKnowledge;
    private Integer studentAbilities;
    private Integer creativity;
    private Integer importanceForeignLanguages;
    private Integer needForInterpersonalSkills;
    private Integer workSkills;
    private Integer teamworkSkills;
    private Integer independentWorkSkills;
    private String questionsInTheQuestionnaire;
    private String yourSuggestions;
    private String yourSuggestionsForChanges;
    private LocalDateTime dateOfPassage;

}
