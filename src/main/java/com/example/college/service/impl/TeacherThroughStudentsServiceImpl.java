package com.example.college.service.impl;

import com.example.college.dao.TeacherThroughStudentsDao;
import com.example.college.dto.TeacherThroughStudentsCreateDto;
import com.example.college.model.TeacherThroughStudents;
import com.example.college.repository.InstitutionRepository;
import com.example.college.repository.TeacherThroughStudentsRepository;
import com.example.college.service.TeacherThroughStudentsService;
import com.example.college.util.ServiceUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TeacherThroughStudentsServiceImpl implements TeacherThroughStudentsService {

    private final TeacherThroughStudentsDao teacherThroughStudentsDao;
    private final TeacherThroughStudentsRepository teacherThroughStudentsRepository;
    private final InstitutionRepository institutionRepository;

    @Override
    public void createTeacherThroughStudents(TeacherThroughStudentsCreateDto createDto) {
        TeacherThroughStudents teacherThroughStudents = TeacherThroughStudents.builder()
                .appearance(createDto.getAppearance())
                .abilityToDialogueWithStudentAudiences(createDto.getAbilityToDialogueWithStudentAudiences())
                .cultureOfSpeech(createDto.getCultureOfSpeech())
                .discipline(createDto.getDiscipline())
                .dateOfPassage(LocalDateTime.now())
                .evaluationOfTheWorkOfTheGroupCurator(createDto.getEvaluationOfTheWorkOfTheGroupCurator())
                .group(createDto.getGroup())
                .institution(institutionRepository.findById(createDto.getInstitutionName().getName()).get())
                .interestSubject(createDto.getInterestSubject())
                .involvingStudentsInScientificActivities(createDto.getInvolvingStudentsInScientificActivities())
                .objectivityInAssessment(createDto.getObjectivityInAssessment())
                .presentationOfMaterial(createDto.getPresentationOfMaterial())
                .proportionalityOfRequirementsInExaminations(createDto.getProportionalityOfRequirementsInExaminations())
                .relationsWithStudents(createDto.getRelationsWithStudents())
                .teacherFullName(createDto.getTeacherFullName())
                .usingModernTeachingMethods(createDto.getUsingModernTeachingMethods())
                .build();

        teacherThroughStudentsRepository.save(teacherThroughStudents);
    }


    @Override
    public List<String> getStaticColumn(String columnName) {
        return teacherThroughStudentsDao.getStaticColumn(columnName);
    }

    @Override
    public List<Map<String, Object>> getStaticWithCount(String columnName) {
        int totalCount = teacherThroughStudentsDao.countPassing();
        Map<Integer, Integer> resultMap = teacherThroughStudentsDao.getStaticsWithCount(columnName);

        return ServiceUtil.buildResultList(columnName, totalCount, resultMap);
    }
}
