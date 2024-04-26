package com.example.college.service.impl;

import com.example.college.dao.OrganizationThroughStudentsDao;
import com.example.college.model.OrganizationThroughStudents;
import com.example.college.service.OrganizationThroughStudentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class OrganizationThroughStudentsServiceImpl implements OrganizationThroughStudentsService {

    private final OrganizationThroughStudentsDao organizationThroughStudentsDao;

    @Override
    public void createOrganizationThroughStudents(OrganizationThroughStudents throughStudents) {
        OrganizationThroughStudents organization = new OrganizationThroughStudents();

        organization.setCourse(throughStudents.getCourse());
        organization.setGroup(throughStudents.getGroup());
        organization.setFormOfEducation(throughStudents.getFormOfEducation());
        organization.setLevelOfStudy(throughStudents.getLevelOfStudy());
        organization.setInstitutionName(throughStudents.getInstitutionName());

        organizationThroughStudentsDao.createOrganizationThroughStudents(organization);
    }
}
