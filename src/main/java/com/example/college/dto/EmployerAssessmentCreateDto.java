package com.example.college.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class EmployerAssessmentCreateDto {

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

}
