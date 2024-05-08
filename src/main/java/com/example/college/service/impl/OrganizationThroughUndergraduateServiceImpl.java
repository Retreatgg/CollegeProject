package com.example.college.service.impl;

import com.example.college.dao.OrganizationThroughUndergraduateDao;
import com.example.college.dto.OrganizationThroughUndergraduateCreateDto;
import com.example.college.model.OrganizationThroughUndergraduate;
import com.example.college.service.OrganizationThroughUndergraduateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

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
        organization.setDateOfPassage(LocalDateTime.now());

        organizationThroughUndergraduateDao.createOrganizationThroughUndergraduate(organization);
    }
}
