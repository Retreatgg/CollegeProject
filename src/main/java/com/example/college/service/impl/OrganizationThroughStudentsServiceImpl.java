package com.example.college.service.impl;

import com.example.college.dao.OrganizationThroughStudentsDao;
import com.example.college.dto.OrganizationThroughStudentsCreateDto;
import com.example.college.model.OrganizationThroughStudents;
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

    @Override
    public void createOrganizationThroughStudents(OrganizationThroughStudentsCreateDto throughStudents) {
        OrganizationThroughStudents organization = new OrganizationThroughStudents();

        organization.setCourse(throughStudents.getCourse());
        organization.setGroup(throughStudents.getGroup());
        organization.setFormOfEducation(throughStudents.getFormOfEducation().getName());
        organization.setLevelOfStudy(throughStudents.getLevelOfStudy().getName());
        organization.setInstitutionName(throughStudents.getInstitutionName().getName());
        organization.setAccessibleElectronicMaterials(throughStudents.getAccessibleElectronicMaterials());
        organization.setAccessToTechnology(throughStudents.getAccessToTechnology());
        organization.setTeachingStaff(throughStudents.getTeachingStaff());
        organization.setRelevanceOfInformation(throughStudents.getRelevanceOfInformation());
        organization.setQualityTeaching(throughStudents.getQualityTeaching());
        organization.setQualityOfEvents(throughStudents.getQualityOfEvents());
        organization.setPsychologicalSupport(throughStudents.getPsychologicalSupport());
        organization.setPositive(throughStudents.getPositive());
        organization.setPayLevel(throughStudents.getPayLevel());
        organization.setParticipationInScience(throughStudents.getParticipationInScience());
        organization.setObjectivityOfTeachers(throughStudents.getObjectivityOfTeachers());
        organization.setNegative(throughStudents.getNegative());
        organization.setModernEquipment(throughStudents.getModernEquipment());
        organization.setMedicalService(throughStudents.getMedicalService());
        organization.setLibraryWork(throughStudents.getLibraryWork());
        organization.setLearningOutcomes(throughStudents.getLearningOutcomes());
        organization.setCorrectChoiceOrganization(throughStudents.getCorrectChoiceOrganization());
        organization.setCorrectChoiceDirection(throughStudents.getCorrectChoiceDirection());
        organization.setConvenienceOfSchedules(throughStudents.getConvenienceOfSchedules());
        organization.setConvenienceOfClassrooms(throughStudents.getConvenienceOfClassrooms());
        organization.setCanteenWork(throughStudents.getCanteenWork());
        organization.setBestTeacher(throughStudents.getBestTeacher());
        organization.setAppearance(throughStudents.getAppearance());
        organization.setWorstTeacher(throughStudents.getWorstTeacher());
        organization.setDateOfPassage(LocalDateTime.now());

        organizationThroughStudentsDao.createOrganizationThroughStudents(organization);
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
