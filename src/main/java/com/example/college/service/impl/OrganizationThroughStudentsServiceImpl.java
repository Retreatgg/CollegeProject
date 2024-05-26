package com.example.college.service.impl;

import com.example.college.dao.OrganizationThroughStudentsDao;
import com.example.college.dto.OrganizationThroughStudentsCreateDto;
import com.example.college.model.OrganizationThroughStudents;
import com.example.college.model.OrganizationThroughUndergraduate;
import com.example.college.repository.FormOfEducationRepository;
import com.example.college.repository.InstitutionRepository;
import com.example.college.repository.LevelOfEducationRepository;
import com.example.college.repository.OrganizationThroughStudentsRepository;
import com.example.college.service.OrganizationThroughStudentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class OrganizationThroughStudentsServiceImpl implements OrganizationThroughStudentsService {

    private final OrganizationThroughStudentsDao organizationThroughStudentsDao;
    private final OrganizationThroughStudentsRepository organizationThroughStudentsRepository;
    private final FormOfEducationRepository formOfEducationRepository;
    private final InstitutionRepository institutionRepository;
    private final LevelOfEducationRepository levelOfEducationRepository;


    @Override
    public void createOrganizationThroughStudents(OrganizationThroughStudentsCreateDto createDto) {
        OrganizationThroughStudents organization = OrganizationThroughStudents.builder()
                .appearance(createDto.getAppearance())
                .accessibleElectronicMaterials(createDto.getAccessibleElectronicMaterials())
                .accessToTechnology(createDto.getAccessToTechnology())
                .bestTeacher(createDto.getBestTeacher())
                .course(createDto.getCourse())
                .canteenWork(createDto.getCanteenWork())
                .correctChoiceOrganization(createDto.getCorrectChoiceOrganization())
                .convenienceOfSchedules(createDto.getConvenienceOfSchedules())
                .correctChoiceDirection(createDto.getCorrectChoiceDirection())
                .convenienceOfClassrooms(createDto.getConvenienceOfClassrooms())
                .dateOfPassage(LocalDateTime.now())
                .group(createDto.getGroup())
                .formOfEducation(formOfEducationRepository.findById(createDto.getFormOfEducation().getName()).get())
                .learningOutcomes(createDto.getLearningOutcomes())
                .levelOfStudy(levelOfEducationRepository.findById(createDto.getLevelOfStudy().getName()).get())
                .libraryWork(createDto.getLibraryWork())
                .institution(institutionRepository.findById(createDto.getInstitutionName().getName()).get())
                .medicalService(createDto.getMedicalService())
                .modernEquipment(createDto.getModernEquipment())
                .negative(createDto.getNegative())
                .objectivityOfTeachers(createDto.getObjectivityOfTeachers())
                .relevanceOfInformation(createDto.getRelevanceOfInformation())
                .positive(createDto.getPositive())
                .payLevel(createDto.getPayLevel())
                .psychologicalSupport(createDto.getPsychologicalSupport())
                .participationInScience(createDto.getParticipationInScience())
                .qualityOfEvents(createDto.getQualityOfEvents())
                .qualityTeaching(createDto.getQualityTeaching())
                .teachingStaff(createDto.getTeachingStaff())
                .worstTeacher(createDto.getWorstTeacher())
                .build();


        organizationThroughStudentsRepository.save(organization);
    }


    @Override
    public List<String> getStaticColumn(String columnName) {
        return organizationThroughStudentsDao.getStaticColumn(columnName);
    }

    @Override
    public List<Map<String, Object>> getStaticWithCount(String columnName) {
        return organizationThroughStudentsDao.getStaticsWithCount(columnName);
    }

}
