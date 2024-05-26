package com.example.college.service.impl;

import com.example.college.dao.SatisfactionRatingDao;
import com.example.college.dto.SatisfactionRatingCreateDto;
import com.example.college.model.SatisfactionRating;
import com.example.college.repository.SatisfactionRatingRepository;
import com.example.college.service.SatisfactionRatingService;
import com.example.college.util.ServiceUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class SatisfactionRatingServiceImpl implements SatisfactionRatingService {

    private final SatisfactionRatingDao satisfactionRatingDao;
    private final SatisfactionRatingRepository satisfactionRatingRepository;

    @Override
    public void createSatisfactionRating(SatisfactionRatingCreateDto createDto) {
        SatisfactionRating satisfactionRating = SatisfactionRating.builder()
                .academicTitle(createDto.getAcademicTitle())
                .activityInterference(createDto.getActivityInterference())
                .activityLevel(createDto.getActivityLevel())
                .activityLevelAndContribution(createDto.getActivityLevelAndContribution())
                .collectiveAgreement(createDto.getCollectiveAgreement())
                .dateOfPassage(LocalDateTime.now())
                .degreeOfInvolvement(createDto.getDegreeOfInvolvement())
                .educationalInstitution(createDto.getEducationalInstitution())
                .equipmentConditions(createDto.getEquipmentConditions())
                .helpGuide(createDto.getHelpGuide())
                .implementation(createDto.getImplementation())
                .interference(createDto.getInterference())
                .influenceQMS(createDto.getInfluenceQMS())
                .informationSecurity(createDto.getInformationSecurity())
                .isEmployeeOfTheAdministration(createDto.getIsEmployeeOfTheAdministration())
                .laborRegulations(createDto.getLaborRegulations())
                .levelOfRegulation(createDto.getLevelOfRegulation())
                .levelOrganization(createDto.getLevelOrganization())
                .motivationSystem(createDto.getMotivationSystem())
                .nameOfTheStructuralUnit(createDto.getNameOfTheStructuralUnit())
                .organizationAndRating(createDto.getOrganizationAndRating())
                .privileges(createDto.getPrivileges())
                .possibilitiesAdm(createDto.getPossibilitiesAdm())
                .possibilitiesOrg(createDto.getPossibilitiesOrg())
                .qualitySatisfaction(createDto.getQualitySatisfaction())
                .qualityManagementSystem(createDto.getQualityManagementSystem())
                .regulatoryDocuments(createDto.getRegulatoryDocuments())
                .relationshipLevel(createDto.getRelationshipLevel())
                .recognitionOfYourSuccessesByYou(createDto.getRecognitionOfYourSuccessesByYou())
                .recognitionOfYourSuccessesByManagement(createDto.getRecognitionOfYourSuccessesByManagement())
                .salary(createDto.getSalary())
                .satisfactionWithTechnology(createDto.getSatisfactionWithTechnology())
                .safetyAndSecurity(createDto.getSafetyAndSecurity())
                .specificProposals(createDto.getSpecificProposals())
                .suggestionsAndComments(createDto.getSuggestionsAndComments())
                .suggestionsForImprovements(createDto.getSuggestionsForImprovements())
                .training(createDto.getTraining())
                .trustLevelInYou(createDto.getTrustLevelInYou())
                .trustLevelInManagement(createDto.getTrustLevelInManagement())
                .volumeAndAccessToInformation(createDto.getVolumeAndAccessToInformation())
                .youAreMissing(createDto.getYouAreMissing())
                .build();

        satisfactionRatingRepository.save(satisfactionRating);
    }


    @Override
    public List<String> getStaticColumn(String columnName) {
        return satisfactionRatingDao.getStaticColumn(columnName);
    }

    @Override
    public List<Map<String, Object>> getStaticWithCount(String columnName) {
        int totalCount = satisfactionRatingDao.countPassing();
        Map<Integer, Integer> resultMap = satisfactionRatingDao.getStaticsWithCount(columnName);

        return ServiceUtil.buildResultList(columnName, totalCount, resultMap);
    }
}
