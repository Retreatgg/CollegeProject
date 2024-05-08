package com.example.college.service;

import com.example.college.dto.OrganizationThroughUndergraduateCreateDto;
import com.example.college.model.OrganizationThroughUndergraduate;
import org.springframework.stereotype.Service;

@Service
public interface OrganizationThroughUndergraduateService {

    void createOrganizationThroughUndergraduate(OrganizationThroughUndergraduateCreateDto throughUndergraduate);
}
