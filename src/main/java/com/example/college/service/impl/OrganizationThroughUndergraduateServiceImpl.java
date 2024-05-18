package com.example.college.service.impl;

import com.example.college.dao.OrganizationThroughUndergraduateDao;
import com.example.college.dto.OrganizationThroughUndergraduateCreateDto;
import com.example.college.model.OrganizationThroughUndergraduate;
import com.example.college.service.OrganizationThroughUndergraduateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class OrganizationThroughUndergraduateServiceImpl implements OrganizationThroughUndergraduateService {

    private final OrganizationThroughUndergraduateDao organizationThroughUndergraduateDao;


    @Override
    public void createOrganizationThroughUndergraduate(OrganizationThroughUndergraduateCreateDto throughUndergraduate) {
        OrganizationThroughUndergraduate organization = new OrganizationThroughUndergraduate();

        organization.setCourse(throughUndergraduate.getCourse());
        organization.setGroup(throughUndergraduate.getGroup());
        organization.setFormOfEducation(throughUndergraduate.getFormOfEducation().getName());
        organization.setInstitutionName(throughUndergraduate.getInstitutionName().getName());
        organization.setAccessibleElectronicMaterials(throughUndergraduate.getAccessibleElectronicMaterials());
        organization.setAccessToTechnology(throughUndergraduate.getAccessToTechnology());
        organization.setTeachingStaff(throughUndergraduate.getTeachingStaff());
        organization.setRelevanceOfInformation(throughUndergraduate.getRelevanceOfInformation());
        organization.setQualityTeaching(throughUndergraduate.getQualityTeaching());
        organization.setQualityOfEvents(throughUndergraduate.getQualityOfEvents());
        organization.setPsychologicalSupport(throughUndergraduate.getPsychologicalSupport());
        organization.setPositive(throughUndergraduate.getPositive());
        organization.setPayLevel(throughUndergraduate.getPayLevel());
        organization.setParticipationInScience(throughUndergraduate.getParticipationInScience());
        organization.setObjectivityOfTeachers(throughUndergraduate.getObjectivityOfTeachers());
        organization.setNegative(throughUndergraduate.getNegative());
        organization.setModernEquipment(throughUndergraduate.getModernEquipment());
        organization.setMedicalService(throughUndergraduate.getMedicalService());
        organization.setLibraryWork(throughUndergraduate.getLibraryWork());
        organization.setLearningOutcomes(throughUndergraduate.getLearningOutcomes());
        organization.setCorrectChoiceOrganization(throughUndergraduate.getCorrectChoiceOrganization());
        organization.setCorrectChoiceDirection(throughUndergraduate.getCorrectChoiceDirection());
        organization.setConvenienceOfSchedules(throughUndergraduate.getConvenienceOfSchedules());
        organization.setConvenienceOfClassrooms(throughUndergraduate.getConvenienceOfClassrooms());
        organization.setCanteenWork(throughUndergraduate.getCanteenWork());
        organization.setBestTeacher(throughUndergraduate.getBestTeacher());
        organization.setAppearance(throughUndergraduate.getAppearance());
        organization.setWorstTeacher(throughUndergraduate.getWorstTeacher());
        organization.setDateOfPassage(LocalDateTime.now());

        organizationThroughUndergraduateDao.createOrganizationThroughUndergraduate(organization);
    }

    @Override
    public List<String> getStaticColumn(String columnName) {
        return organizationThroughUndergraduateDao.getStaticColumn(columnName);
    }

    @Override
    public List<Map<String, Object>> getStaticWithCount(String columnName) {
        return organizationThroughUndergraduateDao.getStaticsWithCount(columnName);
    }
}
