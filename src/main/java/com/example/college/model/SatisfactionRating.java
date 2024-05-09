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
    private Integer trustLevelInManagement;
    private Integer trustLevelInYou;
    private Integer degreeOfInvolvement;
    private Integer relationshipLevel;
    private Integer recognitionOfYourSuccessesByYou;
    private Integer recognitionOfYourSuccessesByManagement;
    private Integer helpGuide;
    private Integer levelOfRegulation;
    private Integer equipmentConditions;
    private Integer safetyAndSecurity;
    private Integer educationalInstitution;
    private Integer satisfactionWithTechnology;
    private Integer qualitySatisfaction;
    private Integer possibilitiesOrg;
    private Integer possibilitiesAdm;
    private Integer salary;
    private Integer motivationSystem;
    private Integer levelOrganization;
    private Integer collectiveAgreement;
    private Integer laborRegulations;
    private Integer informationSecurity;
    private Integer volumeAndAccessToInformation;
    private Integer regulatoryDocuments;
    private Integer activityLevel;
    private Integer activityLevelAndContribution;
    private Integer implementation;
    private Integer qualityManagementSystem;
    private Integer influenceQMS;
    private Integer organizationAndRating;
    private String suggestionsForImprovements;
    private String suggestionsAndComments;
    private String specificProposals;
    private String privileges;
    private String interference;
    private String activityInterference;
    private String youAreMissing;
    private String training;
    private LocalDateTime dateOfPassage;

}
