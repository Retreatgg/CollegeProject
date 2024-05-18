package com.example.college.service.impl;

import com.example.college.dao.EmployerAssessmentDao;
import com.example.college.dto.EmployerAssessmentCreateDto;
import com.example.college.model.EmployerAssessment;
import com.example.college.service.EmployerAssessmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class EmployerAssessmentServiceImpl implements EmployerAssessmentService {

    private final EmployerAssessmentDao employerAssessmentDao;

    @Override
    public void createEmployerAssessment(EmployerAssessmentCreateDto employerAssessmentCreateDto) {
        EmployerAssessment assessment = new EmployerAssessment();

        assessment.setEducationalPrograms(employerAssessmentCreateDto.getEducationalPrograms());
        assessment.setStartYearCooperation(employerAssessmentCreateDto.getStartYearCooperation());
        assessment.setCountCompletedInternship(employerAssessmentCreateDto.getCountCompletedInternship());
        assessment.setCreativity(employerAssessmentCreateDto.getCreativity());
        assessment.setCountEmployed(employerAssessmentCreateDto.getCountEmployed());
        assessment.setEducationalPrograms(employerAssessmentCreateDto.getEducationalPrograms());
        assessment.setDateOfPassage(LocalDateTime.now());
        assessment.setBasicPracticalSkills(employerAssessmentCreateDto.getBasicPracticalSkills());
        assessment.setAbilityToAcquireNewKnowledge(employerAssessmentCreateDto.getAbilityToAcquireNewKnowledge());
        assessment.setCountWorkingInTheirSpecialty(employerAssessmentCreateDto.getCountWorkingInTheirSpecialty());
        assessment.setGeneralTheoreticalTraining(employerAssessmentCreateDto.getGeneralTheoreticalTraining());
        assessment.setNeedForInterpersonalSkills(employerAssessmentCreateDto.getNeedForInterpersonalSkills());
        assessment.setImportanceForeignLanguages(employerAssessmentCreateDto.getImportanceForeignLanguages());
        assessment.setIndependentWorkSkills(employerAssessmentCreateDto.getIndependentWorkSkills());
        assessment.setProfessionalTrainingGraduates(employerAssessmentCreateDto.getProfessionalTrainingGraduates());
        assessment.setQuestionsInTheQuestionnaire(employerAssessmentCreateDto.getQuestionsInTheQuestionnaire());
        assessment.setStudentAbilities(employerAssessmentCreateDto.getStudentAbilities());
        assessment.setStudentTraining(employerAssessmentCreateDto.getStudentTraining());
        assessment.setTeamworkSkills(employerAssessmentCreateDto.getTeamworkSkills());
        assessment.setYourSuggestions(employerAssessmentCreateDto.getYourSuggestions());
        assessment.setYourSuggestionsForChanges(employerAssessmentCreateDto.getYourSuggestionsForChanges());
        assessment.setWrittenAndOralLiteracy(employerAssessmentCreateDto.getWrittenAndOralLiteracy());

        employerAssessmentDao.createEmployerAssessment(assessment);
    }


    @Override
    public List<String> getStaticColumn(String columnName) {
        return employerAssessmentDao.getStaticColumn(columnName);
    }

    @Override
    public List<Map<String, Object>> getStaticWithCount(String columnName) {
        return employerAssessmentDao.getStaticsWithCount(columnName);
    }
}
