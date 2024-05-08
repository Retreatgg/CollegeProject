package com.example.college.model;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TeacherThroughStudents {

    private Long id;
    private String institutionName;
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
    private LocalDateTime dateOfPassage;

}
