package com.example.college.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrganizationThroughUndergraduateCreateDto {

    private InstitutionDto institutionName;
    private String group;
    private FormOfEducationDto formOfEducation;
    private Integer course;
    private Integer correctChoiceOrganization;
    private Integer correctChoiceDirection;
    private Integer qualityTeaching;
    private Integer payLevel;
    private Integer participationInScience;
    private Integer qualityOfEvents;
    private Integer relevanceOfInformation;
    private Integer modernEquipment;
    private Integer objectivityOfTeachers;
    private Integer learningOutcomes;
    private Integer accessToTechnology;
    private Integer libraryWork;
    private Integer convenienceOfSchedules;
    private Integer convenienceOfClassrooms;
    private Integer accessibleElectronicMaterials;
    private Integer psychologicalSupport;
    private Integer canteenWork;
    private Integer medicalService;
    private Integer TeachingStaff;
    private String bestTeacher;
    private String worstTeacher;
    private String positive;
    private String negative;
    private String appearance;

}
