package com.example.college.repository;

import com.example.college.model.OrganizationThroughStudents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationThroughStudentsRepository extends JpaRepository<OrganizationThroughStudents, Long> {
}
