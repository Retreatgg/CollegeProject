package com.example.college.dao;

import com.example.college.model.TeacherThroughStudents;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class TeacherThroughStudentsDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final JdbcTemplate jdbcTemplate;

    public void createTeacherThroughStudentsDao(TeacherThroughStudents teacherThroughStudents) {
        String sql = """
                insert into TEACHER_THROUGH_THE_EYES_OF_A_STUDENT(
                    institution_name, group, discipline, teacher_full_name, 
                    presentation_of_material, interest_subject, proportionality_of_requirements_in_examinations, 
                    objectivity_in_assessment, relations_with_students, ability_to_dialogue_with_student_audiences, 
                    using_modern_teaching_methods, involving_students_in_scientific_activities, culture_of_speech, appearance, 
                    evaluation_of_the_work_of_the_group_curator
                ) 
                VALUES ( 
                    :institution_name, :group, :discipline, :teacher_full_name, 
                    :presentation_of_material, interest_subject, :proportionality_of_requirements_in_examinations, 
                    :objectivity_in_assessment, :relations_with_students, :ability_to_dialogue_with_student_audiences, 
                    :using_modern_teaching_methods, :involving_students_in_scientific_activities, :culture_of_speech, 
                    :appearance, :evaluation_of_the_work_of_the_group_curator )
                """;

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource()
                .addValue("institution_name", teacherThroughStudents.getInstitutionName())
                .addValue("group", teacherThroughStudents.getGroup())
                .addValue("discipline", teacherThroughStudents.getDiscipline())
                .addValue("teacher_full_name", teacherThroughStudents.getTeacherFullName())
                .addValue("presentation_of_material", teacherThroughStudents.getPresentationOfMaterial())
                .addValue("interest_subject", teacherThroughStudents.getInterestSubject())
                .addValue("proportionality_of_requirements_in_examinations", teacherThroughStudents.getProportionalityOfRequirementsInExaminations())
                .addValue("objectivity_in_assessment", teacherThroughStudents.getObjectivityInAssessment())
                .addValue("relations_with_students", teacherThroughStudents.getRelationsWithStudents())
                .addValue("ability_to_dialogue_with_student_audiences", teacherThroughStudents.getAbilityToDialogueWithStudentAudiences())
                .addValue("using_modern_teaching_methods", teacherThroughStudents.getUsingModernTeachingMethods())
                .addValue("involving_students_in_scientific_activities", teacherThroughStudents.getInvolvingStudentsInScientificActivities())
                .addValue("culture_of_speech", teacherThroughStudents.getCultureOfSpeech())
                .addValue("appearance", teacherThroughStudents.getAppearance())
                .addValue("evaluation_of_the_work_of_the_group_curator", teacherThroughStudents.getEvaluationOfTheWorkOfTheGroupCurator()));
    }

    public Long countPassing() {
        String sql = """
                select max(id) from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT
                """;

        return jdbcTemplate.queryForObject(sql, Long.class);
    }

    public List<String> getStaticColumn(String columnName) {
        String sql = """
                select %s from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT
                """;

        return jdbcTemplate.queryForList(sql, String.class, columnName);
    }

    public List<Map<String, Object>> getStaticsWithCount(String columnName) {
        String sql =  "SELECT " + columnName + " AS value, COUNT(*) AS count " +
                "FROM TEACHER_THROUGH_THE_EYES_OF_A_STUDENT " +
                "GROUP BY " + columnName;
        return jdbcTemplate.queryForList(sql);
    }
}
