package com.example.college.service.impl;

import com.example.college.dao.OrganizationThroughUndergraduateDao;
import com.example.college.dto.OrganizationThroughUndergraduateCreateDto;
import com.example.college.model.OrganizationThroughUndergraduate;
import com.example.college.repository.FormOfEducationRepository;
import com.example.college.repository.InstitutionRepository;
import com.example.college.repository.OrganizationThroughUndergraduateRepository;
import com.example.college.service.OrganizationThroughUndergraduateService;
import com.example.college.util.ServiceUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class OrganizationThroughUndergraduateServiceImpl implements OrganizationThroughUndergraduateService {

    private final OrganizationThroughUndergraduateDao organizationThroughUndergraduateDao;
    private final OrganizationThroughUndergraduateRepository organizationThroughUndergraduateRepository;
    private final FormOfEducationRepository formOfEducationRepository;
    private final InstitutionRepository institutionRepository;


    @Override
    public void createOrganizationThroughUndergraduate(OrganizationThroughUndergraduateCreateDto createDto) {
        OrganizationThroughUndergraduate organization = OrganizationThroughUndergraduate.builder()
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

        organizationThroughUndergraduateRepository.save(organization);
    }

    @Override
    public List<String> getStaticColumn(String columnName) {
        return organizationThroughUndergraduateDao.getStaticColumn(columnName);
    }

    @Override
    public List<Map<String, Object>> getStaticWithCount(String columnName) {
        int totalCount = organizationThroughUndergraduateDao.countPassing();
        Map<Integer, Integer> resultMap = organizationThroughUndergraduateDao.getStaticsWithCount(columnName);

        return ServiceUtil.buildResultList(columnName, totalCount, resultMap);
    }
}
