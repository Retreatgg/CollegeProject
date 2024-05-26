package com.example.college.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@Table(name = "educational_organization_through_the_eyes_of_undergraduates")
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationThroughUndergraduate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "institution_name")
    private Institution institution;

    @Column(name = "group")
    private String group;

    @ManyToOne
    @JoinColumn(name = "form_of_education")
    private FormOfEducation formOfEducation;

    @Column(name = "course")
    private Integer course;

    @Column(name = "correct_choice_organization")
    private Integer correctChoiceOrganization;

    @Column(name = "correct_choice_direction")
    private Integer correctChoiceDirection;

    @Column(name = "quality_teaching")
    private Integer qualityTeaching;

    @Column(name = "pay_level")
    private Integer payLevel;

    @Column(name = "participation_in_science")
    private Integer participationInScience;

    @Column(name = "quality_of_events")
    private Integer qualityOfEvents;

    @Column(name = "relevance_of_information")
    private Integer relevanceOfInformation;

    @Column(name = "modern_equipment")
    private Integer modernEquipment;

    @Column(name = "objectivity_of_teachers")
    private Integer objectivityOfTeachers;

    @Column(name = "learning_outcomes")
    private Integer learningOutcomes;

    @Column(name = "access_to_technology")
    private Integer accessToTechnology;

    @Column(name = "library_work")
    private Integer libraryWork;

    @Column(name = "convenience_of_schedules")
    private Integer convenienceOfSchedules;

    @Column(name = "convenience_of_classrooms")
    private Integer convenienceOfClassrooms;

    @Column(name = "accessible_electronic_materials")
    private Integer accessibleElectronicMaterials;

    @Column(name = "psychological_support")
    private Integer psychologicalSupport;

    @Column(name = "canteen_work")
    private Integer canteenWork;

    @Column(name = "medical_service")
    private Integer medicalService;

    @Column(name = "teaching_staff")
    private Integer teachingStaff;

    @Column(name = "best_teacher")
    private String bestTeacher;

    @Column(name = "worst_teacher")
    private String worstTeacher;

    @Column(name = "positive")
    private String positive;

    @Column(name = "negative")
    private String negative;

    @Column(name = "appearance")
    private String appearance;

    @Column(name = "date_of_passage")
    private LocalDateTime dateOfPassage;
}
