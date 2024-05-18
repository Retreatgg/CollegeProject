package com.example.college.service.impl;

import com.example.college.dao.TeacherThroughStudentsDao;
import com.example.college.dto.TeacherThroughStudentsCreateDto;
import com.example.college.model.TeacherThroughStudents;
import com.example.college.service.TeacherThroughStudentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TeacherThroughStudentsServiceImpl implements TeacherThroughStudentsService {

    private final TeacherThroughStudentsDao teacherThroughStudentsDao;

    @Override
    public void createTeacherThroughStudents(TeacherThroughStudentsCreateDto students) {
        TeacherThroughStudents teacherThroughStudents = new TeacherThroughStudents();

        teacherThroughStudents.setGroup(students.getGroup());
        teacherThroughStudents.setAppearance(students.getAppearance());
        teacherThroughStudents.setDiscipline(students.getDiscipline());
        teacherThroughStudents.setAbilityToDialogueWithStudentAudiences(students.getAbilityToDialogueWithStudentAudiences());
        teacherThroughStudents.setCultureOfSpeech(students.getCultureOfSpeech());
        teacherThroughStudents.setEvaluationOfTheWorkOfTheGroupCurator(students.getEvaluationOfTheWorkOfTheGroupCurator());
        teacherThroughStudents.setInterestSubject(students.getInterestSubject());
        teacherThroughStudents.setInvolvingStudentsInScientificActivities(students.getInvolvingStudentsInScientificActivities());
        teacherThroughStudents.setObjectivityInAssessment(students.getObjectivityInAssessment());
        teacherThroughStudents.setPresentationOfMaterial(students.getPresentationOfMaterial());
        teacherThroughStudents.setUsingModernTeachingMethods(students.getUsingModernTeachingMethods());
        teacherThroughStudents.setTeacherFullName(students.getTeacherFullName());
        teacherThroughStudents.setRelationsWithStudents(students.getRelationsWithStudents());
        teacherThroughStudents.setProportionalityOfRequirementsInExaminations(students.getProportionalityOfRequirementsInExaminations());
        teacherThroughStudents.setInstitutionName(students.getInstitutionName().getName());
        teacherThroughStudents.setDateOfPassage(LocalDateTime.now());

        teacherThroughStudentsDao.createTeacherThroughStudentsDao(teacherThroughStudents);
    }


    @Override
    public List<String> getStaticColumn(String columnName) {
        return teacherThroughStudentsDao.getStaticColumn(columnName);
    }

    @Override
    public List<Map<String, Object>> getStaticWithCount(String columnName) {
        return teacherThroughStudentsDao.getStaticsWithCount(columnName);
    }
}
