package com.example.college.repository;

import com.example.college.model.EmployerAssessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerAssessmentRepository extends JpaRepository<EmployerAssessment, Long> {
}
