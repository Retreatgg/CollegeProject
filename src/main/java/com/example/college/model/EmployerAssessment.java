package com.example.college.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Builder
@Table(name = "employer_assessment")
@AllArgsConstructor
@NoArgsConstructor
public class EmployerAssessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "educational_programs")
    private String educationalPrograms;

    @Column(name = "start_year_cooperation")
    @Temporal(TemporalType.DATE)
    private Date startYearCooperation;

    @Column(name = "count_completed_internship")
    private Integer countCompletedInternship;

    @Column(name = "count_employed")
    private Integer countEmployed;

    @Column(name = "count_working_in_their_specialty")
    private Integer countWorkingInTheirSpecialty;

    @Column(name = "student_training")
    private Integer studentTraining;

    @Column(name = "professional_training_graduates")
    private Integer professionalTrainingGraduates;

    @Column(name = "general_theoretical_training")
    private Integer generalTheoreticalTraining;

    @Column(name = "basic_practical_skills")
    private Integer basicPracticalSkills;

    @Column(name = "written_and_oral_literacy")
    private Integer writtenAndOralLiteracy;

    @Column(name = "ability_to_acquire_new_knowledge")
    private Integer abilityToAcquireNewKnowledge;

    @Column(name = "student_abilities")
    private Integer studentAbilities;

    @Column(name = "creativity")
    private Integer creativity;

    @Column(name = "importance_foreign_languages")
    private Integer importanceForeignLanguages;

    @Column(name = "need_for_interpersonal_skills")
    private Integer needForInterpersonalSkills;

    @Column(name = "work_skills")
    private Integer workSkills;

    @Column(name = "teamwork_skills")
    private Integer teamworkSkills;

    @Column(name = "independent_work_skills")
    private Integer independentWorkSkills;

    @Column(name = "questions_in_the_questionnaire")
    private String questionsInTheQuestionnaire;

    @Column(name = "your_suggestions")
    private String yourSuggestions;

    @Column(name = "your_suggestions_for_changes")
    private String yourSuggestionsForChanges;

    @Column(name = "date_of_passage")
    private LocalDateTime dateOfPassage;

}
