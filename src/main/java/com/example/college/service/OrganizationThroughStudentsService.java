package com.example.college.service;

import com.example.college.model.OrganizationThroughStudents;
import org.springframework.stereotype.Service;

@Service
public interface OrganizationThroughStudentsService {

    void createOrganizationThroughStudents(OrganizationThroughStudents throughStudents);
}