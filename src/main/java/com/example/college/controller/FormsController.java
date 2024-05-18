package com.example.college.controller;

import com.example.college.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("api/form/static")
public class FormsController {

    private final EmployerAssessmentService employerAssessmentService;
    private final OrganizationThroughStudentsService organizationThroughStudentsService;
    private final OrganizationThroughUndergraduateService organizationThroughUndergraduateService;
    private final SatisfactionRatingService satisfactionRatingService;
    private final TeacherThroughStudentsService teacherThroughStudentsService;


    @GetMapping("employer_assesmenent/count")
    public ResponseEntity<?> employerCount(@RequestParam String columnName) {
        return ResponseEntity.ok(employerAssessmentService.getStaticWithCount(columnName));
    }

    @GetMapping("employer_assesment")
    public ResponseEntity<?> employer(@RequestParam String columName) {
        return ResponseEntity.ok(employerAssessmentService.getStaticColumn(columName));
    }

    @GetMapping("org_student/count")
    public ResponseEntity<?> studentCount(@RequestParam String columnName) {
        return ResponseEntity.ok(organizationThroughStudentsService.getStaticWithCount(columnName));
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

}
