package com.example.college.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@Table(name = "satisfaction_rating")
@AllArgsConstructor
@NoArgsConstructor
public class SatisfactionRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_of_the_structural_unit")
    private String nameOfTheStructuralUnit;

    @Column(name = "is_employee_of_the_administration")
    private Boolean isEmployeeOfTheAdministration;

    @Column(name = "academic_title")
    private String academicTitle;

    @Column(name = "trust_level_in_management")
    private Integer trustLevelInManagement;

    @Column(name = "trust_level_in_you")
    private Integer trustLevelInYou;

    @Column(name = "degree_of_involvement")
    private Integer degreeOfInvolvement;

    @Column(name = "relationship_level")
    private Integer relationshipLevel;

    @Column(name = "recognition_of_your_successes_by_you")
    private Integer recognitionOfYourSuccessesByYou;

    @Column(name = "recognition_of_your_successes_by_management")
    private Integer recognitionOfYourSuccessesByManagement;

    @Column(name = "help_guide")
    private Integer helpGuide;

    @Column(name = "level_of_regulation")
    private Integer levelOfRegulation;

    @Column(name = "equipment_conditions")
    private Integer equipmentConditions;

    @Column(name = "safety_and_security")
    private Integer safetyAndSecurity;

    @Column(name = "educational_institution")
    private Integer educationalInstitution;

    @Column(name = "satisfaction_with_technology")
    private Integer satisfactionWithTechnology;

    @Column(name = "quality_satisfaction")
    private Integer qualitySatisfaction;

    @Column(name = "possibilities_org")
    private Integer possibilitiesOrg;

    @Column(name = "possibilities_adm")
    private Integer possibilitiesAdm;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "motivation_system")
    private Integer motivationSystem;

    @Column(name = "level_organization")
    private Integer levelOrganization;

    @Column(name = "collective_agreement")
    private Integer collectiveAgreement;

    @Column(name = "labor_regulations")
    private Integer laborRegulations;

    @Column(name = "information_security")
    private Integer informationSecurity;

    @Column(name = "volume_and_access_to_information")
    private Integer volumeAndAccessToInformation;

    @Column(name = "regulatory_documents")
    private Integer regulatoryDocuments;

    @Column(name = "activity_level")
    private Integer activityLevel;

    @Column(name = "activity_level_and_contribution")
    private Integer activityLevelAndContribution;

    @Column(name = "implementation")
    private Integer implementation;

    @Column(name = "quality_management_system")
    private Integer qualityManagementSystem;

    @Column(name = "influence_qms")
    private Integer influenceQMS;

    @Column(name = "organization_and_rating")
    private Integer organizationAndRating;

    @Column(name = "suggestions_for_improvements")
    private String suggestionsForImprovements;

    @Column(name = "suggestions_and_comments")
    private String suggestionsAndComments;

    @Column(name = "specific_proposals")
    private String specificProposals;

    @Column(name = "privileges")
    private String privileges;

    @Column(name = "interference")
    private String interference;

    @Column(name = "activity_interference")
    private String activityInterference;

    @Column(name = "you_are_missing")
    private String youAreMissing;

    @Column(name = "training")
    private String training;

    @Column(name = "date_of_passage")
    private LocalDateTime dateOfPassage;
}
