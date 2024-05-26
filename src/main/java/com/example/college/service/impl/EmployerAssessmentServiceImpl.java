package com.example.college.service.impl;

import com.example.college.dao.EmployerAssessmentDao;
import com.example.college.dto.EmployerAssessmentCreateDto;
import com.example.college.model.EmployerAssessment;
import com.example.college.repository.EmployerAssessmentRepository;
import com.example.college.service.EmployerAssessmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class EmployerAssessmentServiceImpl implements EmployerAssessmentService {

    private final EmployerAssessmentDao employerAssessmentDao;
    private final EmployerAssessmentRepository employerAssessmentRepository;

    @Override
    public void createEmployerAssessment(EmployerAssessmentCreateDto createDto) {
        EmployerAssessment assessment = EmployerAssessment.builder()
                .abilityToAcquireNewKnowledge(createDto.getAbilityToAcquireNewKnowledge())
                .basicPracticalSkills(createDto.getBasicPracticalSkills())
                .creativity(createDto.getCreativity())
                .countEmployed(createDto.getCountEmployed())
                .countCompletedInternship(createDto.getCountCompletedInternship())
                .countWorkingInTheirSpecialty(createDto.getCountWorkingInTheirSpecialty())
                .dateOfPassage(LocalDateTime.now())
                .educationalPrograms(createDto.getEducationalPrograms())
                .generalTheoreticalTraining(createDto.getGeneralTheoreticalTraining())
                .independentWorkSkills(createDto.getIndependentWorkSkills())
                .importanceForeignLanguages(createDto.getImportanceForeignLanguages())
                .needForInterpersonalSkills(createDto.getNeedForInterpersonalSkills())
                .professionalTrainingGraduates(createDto.getProfessionalTrainingGraduates())
                .questionsInTheQuestionnaire(createDto.getQuestionsInTheQuestionnaire())
                .studentTraining(createDto.getStudentTraining())
                .studentAbilities(createDto.getStudentAbilities())
                .startYearCooperation(createDto.getStartYearCooperation())
                .teamworkSkills(createDto.getTeamworkSkills())
                .workSkills(createDto.getWorkSkills())
                .writtenAndOralLiteracy(createDto.getWrittenAndOralLiteracy())
                .yourSuggestions(createDto.getYourSuggestions())
                .yourSuggestionsForChanges(createDto.getYourSuggestionsForChanges())
                .build();

        employerAssessmentRepository.save(assessment);
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
