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

    public List<Map<String, Object>> getResultsByInstitute() {
        String sql = """
                select INSTITUTION_NAME, count(*) as count from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT group by INSTITUTION_NAME
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getGroups() {
        String sql = """
                select "GROUP", count(*) as count from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT group by "GROUP"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<String> getTeachers() {
        String sql = """
                select TEACHER_FULL_NAME from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT
                """;

        return jdbcTemplate.queryForList(sql, String.class);
    }

    public List<String> getDisciplines() {
        String sql = """
                select DISCIPLINE from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT
                """;

        return jdbcTemplate.queryForList(sql, String.class);
    }

    public List<Map<String, Object>> getPresentationOfMaterial() {
        String sql = """
                select "PRESENTATION_OF_MATERIAL", count(*) as count from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT group by "PRESENTATION_OF_MATERIAL"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getInterestSubject() {
        String sql = """
                select "INTEREST_SUBJECT", count(*) as count from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT group by "INTEREST_SUBJECT"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getProportionalityOfRequirementsInExaminations() {
        String sql = """
                select "PROPORTIONALITY_OF_REQUIREMENTS_IN_EXAMINATIONS", count(*) as count 
                from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT group by "PROPORTIONALITY_OF_REQUIREMENTS_IN_EXAMINATIONS"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getObjectivityInAssessment() {
        String sql = """
                select "OBJECTIVITY_IN_ASSESSMENT", count(*) as count from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT group by "OBJECTIVITY_IN_ASSESSMENT"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getRelationsWithStudents() {
        String sql = """
                select "RELATIONS_WITH_STUDENTS", count(*) as count from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT group by "RELATIONS_WITH_STUDENTS"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getAbilityToDialogueWithStudentAudiences() {
        String sql = """
                select "ABILITY_TO_DIALOGUE_WITH_STUDENT_AUDIENCES", count(*) as count 
                from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT group by "ABILITY_TO_DIALOGUE_WITH_STUDENT_AUDIENCES"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getUsingModernTeachingMethods() {
        String sql = """
                select "USING_MODERN_TEACHING_METHODS", count(*) as count 
                from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT group by "USING_MODERN_TEACHING_METHODS"
                """;

        return jdbcTemplate.queryForList(sql);
    }


    public List<Map<String, Object>> getInvolvingStudentsInScientificActivities() {
        String sql = """
                select "INVOLVING_STUDENTS_IN_SCIENTIFIC_ACTIVITIES", count(*) as count 
                from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT group by "INVOLVING_STUDENTS_IN_SCIENTIFIC_ACTIVITIES"
                """;

        return jdbcTemplate.queryForList(sql);
    }


    public List<Map<String, Object>> getCultureOfSpeech() {
        String sql = """
                select "CULTURE_OF_SPEECH", count(*) as count 
                from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT group by "CULTURE_OF_SPEECH"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getAppearance() {
        String sql = """
                select "APPEARANCE", count(*) as count from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT group by "APPEARANCE"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getEvaluationOfTheWorkOfTheGroupCurator() {
        String sql = """
                select "EVALUATION_OF_THE_WORK_OF_THE_GROUP_CURATOR", count(*) as count 
                from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT group by "EVALUATION_OF_THE_WORK_OF_THE_GROUP_CURATOR"
                """;

        return jdbcTemplate.queryForList(sql);
    }

}
