package com.example.college.service;

import com.example.college.dto.OrganizationThroughUndergraduateCreateDto;
import com.example.college.model.OrganizationThroughUndergraduate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface OrganizationThroughUndergraduateService {

    void createOrganizationThroughUndergraduate(OrganizationThroughUndergraduateCreateDto throughUndergraduate);

    List<String> getStaticColumn(String columnName);

    List<Map<String, Object>> getStaticWithCount(String columnName);
}
