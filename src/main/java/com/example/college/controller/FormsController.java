package com.example.college.controller;

import com.example.college.dto.*;
import com.example.college.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/form/static")
public class FormsController {

    private final EmployerAssessmentService employerAssessmentService;
    private final OrganizationThroughStudentsService organizationThroughStudentsService;
    private final OrganizationThroughUndergraduateService organizationThroughUndergraduateService;
    private final SatisfactionRatingService satisfactionRatingService;
    private final TeacherThroughStudentsService teacherThroughStudentsService;


    @GetMapping("employer_assessment/count")
    public ResponseEntity<?> employerCount(@RequestParam String columnName) {
        return ResponseEntity.ok(employerAssessmentService.getStaticWithCount(columnName));
    }

    @GetMapping("employer_assessment")
    public ResponseEntity<?> employer(@RequestParam String columName) {
        return ResponseEntity.ok(employerAssessmentService.getStaticColumn(columName));
    }

    @GetMapping("org_student/count")
    public ResponseEntity<?> studentCount(@RequestParam String columnName) {
        return ResponseEntity.ok(organizationThroughStudentsService.getStaticsWithCount(columnName));
    }

    @GetMapping("org_student")
    public ResponseEntity<?> student(@RequestParam String columName) {
        return ResponseEntity.ok(organizationThroughStudentsService.getStaticColumn(columName));
    }

    @GetMapping("org_undergraduate/count")
    public ResponseEntity<?> undergraduateCount(@RequestParam String columnName) {
        return ResponseEntity.ok(organizationThroughUndergraduateService.getStaticWithCount(columnName));
    }

    @GetMapping("org_undergraduate")
    public ResponseEntity<?> undergraduate(@RequestParam String columName) {
        return ResponseEntity.ok(organizationThroughUndergraduateService.getStaticColumn(columName));
    }

    @GetMapping("satisfaction_rating")
    public ResponseEntity<?> satisfaction(@RequestParam String columnName) {
        return ResponseEntity.ok(satisfactionRatingService.getStaticColumn(columnName));
    }

    @GetMapping("satisfaction_rating/count")
    public ResponseEntity<?> satisfactionCount(@RequestParam String columName) {
        return ResponseEntity.ok(satisfactionRatingService.getStaticWithCount(columName));
    }

    @GetMapping("teacher/count")
    public ResponseEntity<?> teacherCount(@RequestParam String columnName) {
        return ResponseEntity.ok(teacherThroughStudentsService.getStaticWithCount(columnName));
    }

    @GetMapping("teacher")
    public ResponseEntity<?> teacher(@RequestParam String columName) {
        return ResponseEntity.ok(teacherThroughStudentsService.getStaticColumn(columName));
    }

    @PostMapping("create/teacher")
    public HttpStatus createTeacher(@RequestBody TeacherThroughStudentsCreateDto createDto) {
        teacherThroughStudentsService.createTeacherThroughStudents(createDto);
        return HttpStatus.OK;
    }

    @PostMapping("create/satisfaction")
    public HttpStatus createSatisfaction(@RequestBody SatisfactionRatingCreateDto createDto) {
        satisfactionRatingService.createSatisfactionRating(createDto);
        return HttpStatus.OK;
    }

    @PostMapping("create/org_undergraduate")
    public HttpStatus createUndergraduate(@RequestBody OrganizationThroughUndergraduateCreateDto createDto) {
        organizationThroughUndergraduateService.createOrganizationThroughUndergraduate(createDto);
        return HttpStatus.OK;
    }

    @PostMapping("create/org_students")
    public HttpStatus createStudent(@RequestBody OrganizationThroughStudentsCreateDto createDto) {
        organizationThroughStudentsService.createOrganizationThroughStudents(createDto);
        return HttpStatus.OK;
    }



}
