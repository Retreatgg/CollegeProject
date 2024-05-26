package com.example.college.repository;

import com.example.college.model.TeacherThroughStudents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherThroughStudentsRepository extends JpaRepository<TeacherThroughStudents, Long> {
}
