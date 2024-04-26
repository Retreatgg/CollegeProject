package com.example.college.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeacherThroughStudentsCreateDto {

    private InstitutionDto institutionName;
    private String group;
    private String discipline;
    private String teacherFullName;
    private Integer presentationOfMaterial;
    private Integer interestSubject;
    private Integer proportionalityOfRequirementsInExaminations;
    private Integer objectivityInAssessment;
    private Integer relationsWithStudents;
    private Integer abilityToDialogueWithStudentAudiences;
    private Integer usingModernTeachingMethods;
    private Integer involvingStudentsInScientificActivities;
    private Integer cultureOfSpeech;
    private Integer appearance;
    private Integer evaluationOfTheWorkOfTheGroupCurator;
}
