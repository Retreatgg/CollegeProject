package com.example.college.dao;

import com.example.college.model.OrganizationThroughStudents;
import com.example.college.model.TeacherThroughStudents;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class OrganizationThroughStudentsDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final JdbcTemplate jdbcTemplate;

    public void createOrganizationThroughStudents(OrganizationThroughStudents organizationThroughStudents) {
        String sql = """
                insert into EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_STUDENTS(
                institution_name, group, form_of_education, level_of_study, course, 
                correct_choice_organization, correct_choice_direction, quality_teaching, 
                pay_level, participation_in_science, quality_of_events, relevance_of_information, 
                modern_equipment, objectivity_of_teachers, learning_outcomes, access_to_technology, 
                library_work, accessible_electronic_materials, psychological_support, canteen_work, 
                medical_service, teaching_staff, best_teacher, worst_teacher, positive, negative, 
                appearance, date_of_passage) 
                values ( 
                 :institution_name, :group, :form_of_education, :level_of_study, :course,
                 :correct_choice_organization, :correct_choice_direction, :quality_teaching,
                 :pay_level, :participation_in_science, :quality_of_events, :relevance_of_information,
                 :modern_equipment, :objectivity_of_teachers, :learning_outcomes, :access_to_technology,
                 :library_work, :accessible_electronic_materials, :psychological_support, :canteen_work,
                :medical_service, :teaching_staff, :best_teacher, :worst_teacher, :positive, :negative,
                :appearance, :date_of_passage                 
                ) 
                """;

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource()
                .addValue("institution_name", organizationThroughStudents.getInstitutionName())
                .addValue("group", organizationThroughStudents.getGroup())
                .addValue("form_of_education", organizationThroughStudents.getFormOfEducation())
                .addValue("level_of_study", organizationThroughStudents.getLevelOfStudy())
                .addValue("course", organizationThroughStudents.getCourse())
                .addValue("correct_choice_organization", organizationThroughStudents.getCorrectChoiceOrganization())
                .addValue("correct_choice_direction", organizationThroughStudents.getCorrectChoiceDirection())
                .addValue("quality_teaching", organizationThroughStudents.getQualityTeaching())
                .addValue("pay_level", organizationThroughStudents.getPayLevel())
                .addValue("participation_in_science", organizationThroughStudents.getParticipationInScience())
                .addValue("quality_of_events", organizationThroughStudents.getQualityOfEvents())
                .addValue("relevance_of_information", organizationThroughStudents.getRelevanceOfInformation())
                .addValue("modern_equipment", organizationThroughStudents.getModernEquipment())
                .addValue("objectivity_of_teachers", organizationThroughStudents.getObjectivityOfTeachers())
                .addValue("learning_outcomes", organizationThroughStudents.getLearningOutcomes())
                .addValue("access_to_technology", organizationThroughStudents.getAccessToTechnology())
                .addValue("library_work", organizationThroughStudents.getLibraryWork())
                .addValue("accessible_electronic_materials", organizationThroughStudents.getAccessibleElectronicMaterials())
                .addValue("psychological_support", organizationThroughStudents.getPsychologicalSupport())
                .addValue("canteen_work", organizationThroughStudents.getCanteenWork())
                .addValue("medical_service", organizationThroughStudents.getMedicalService())
                .addValue("teaching_staff", organizationThroughStudents.getTeachingStaff())
                .addValue("best_teacher", organizationThroughStudents.getBestTeacher())
                .addValue("worst_teacher", organizationThroughStudents.getWorstTeacher())
                .addValue("positive", organizationThroughStudents.getPositive())
                .addValue("negative", organizationThroughStudents.getNegative())
                .addValue("appearance", organizationThroughStudents.getAppearance())
                .addValue("date_of_passage", organizationThroughStudents.getDateOfPassage()));
    }


    public Long countPassing() {
        String sql = """
                select max(id) from EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_STUDENTS
                """;

        return jdbcTemplate.queryForObject(sql, Long.class);
    }

    public List<String> getStaticColumn(String columnName) {
        String sql = """
                select %s from EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_STUDENTS
                """;

        return jdbcTemplate.queryForList(sql, String.class, columnName);
    }

    public List<Map<String, Object>> getStaticsWithCount(String columnName) {
        String totalCountQuery = "SELECT COUNT(*) FROM EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_STUDENTS";
        int totalCount = jdbcTemplate.queryForObject(totalCountQuery, Integer.class);

        String sql = "SELECT " + columnName + ", (COUNT(*) * 100 / ?) AS percentage " +
                "FROM EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_STUDENTS " +
                "GROUP BY " + columnName;

        return jdbcTemplate.query(sql, new Object[]{totalCount}, (rs, rowNum) -> {
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put(columnName, rs.getString(columnName));
            resultMap.put("percentage", rs.getDouble("percentage"));
            return resultMap;
        });
    }
}
