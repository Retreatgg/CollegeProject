package com.example.college.repository;

import com.example.college.model.FormOfEducation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormOfEducationRepository extends JpaRepository<FormOfEducation, String> {
}
