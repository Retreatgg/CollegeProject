package com.example.college.repository;

import com.example.college.model.LevelOfEducation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelOfEducationRepository extends JpaRepository<LevelOfEducation, String> {
}
