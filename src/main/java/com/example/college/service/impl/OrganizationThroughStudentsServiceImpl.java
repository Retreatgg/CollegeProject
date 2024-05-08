package com.example.college.service.impl;

import com.example.college.dao.OrganizationThroughStudentsDao;
import com.example.college.dto.OrganizationThroughStudentsCreateDto;
import com.example.college.model.OrganizationThroughStudents;
import com.example.college.service.OrganizationThroughStudentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


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
        organization.setDateOfPassage(LocalDateTime.now());

        organizationThroughStudentsDao.createOrganizationThroughStudents(organization);
    }
}
