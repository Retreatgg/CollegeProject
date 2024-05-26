package com.example.college.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@Table(name = "teacher_through_the_eyes_of_a_student")
@AllArgsConstructor
@NoArgsConstructor
public class TeacherThroughStudents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "institution_name")
    private Institution institution;

    @Column(name = "group")
    private String group;

    @Column(name = "discipline")
    private String discipline;

    @Column(name = "teacher_full_name")
    private String teacherFullName;

    @Column(name = "presentation_of_material")
    private Integer presentationOfMaterial;

    @Column(name = "interest_subject")
    private Integer interestSubject;

    @Column(name = "proportionality_of_requirements_in_examinations")
    private Integer proportionalityOfRequirementsInExaminations;

    @Column(name = "objectivity_in_assessment")
    private Integer objectivityInAssessment;

    @Column(name = "relations_with_students")
    private Integer relationsWithStudents;

    @Column(name = "ability_to_dialogue_with_student_audiences")
    private Integer abilityToDialogueWithStudentAudiences;

    @Column(name = "using_modern_teaching_methods")
    private Integer usingModernTeachingMethods;

    @Column(name = "involving_students_in_scientific_activities")
    private Integer involvingStudentsInScientificActivities;

    @Column(name = "culture_of_speech")
    private Integer cultureOfSpeech;

    @Column(name = "appearance")
    private Integer appearance;

    @Column(name = "evaluation_of_the_work_of_the_group_curator")
    private Integer evaluationOfTheWorkOfTheGroupCurator;

    @Column(name = "date_of_passage")
    private LocalDateTime dateOfPassage;
}
