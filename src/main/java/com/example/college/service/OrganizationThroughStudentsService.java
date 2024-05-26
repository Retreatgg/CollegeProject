package com.example.college.service;

import com.example.college.dto.OrganizationThroughStudentsCreateDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface OrganizationThroughStudentsService {

    void createOrganizationThroughStudents(OrganizationThroughStudentsCreateDto throughStudents);

    List<String> getStaticColumn(String columnName);

    List<Map<String, Object>> getStaticsWithCount(String columnName);
}
