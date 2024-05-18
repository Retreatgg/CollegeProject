package com.example.college.dao;

import com.example.college.model.OrganizationThroughUndergraduate;
import com.example.college.model.TeacherThroughStudents;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class OrganizationThroughUndergraduateDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final JdbcTemplate jdbcTemplate;

    public void createOrganizationThroughUndergraduate(OrganizationThroughUndergraduate organizationThroughUndergraduate){
        String sql = """
                insert into EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_UNDERGRADUATES(
                    institution_name, group, form_of_education, course,
                    correct_choice_organization, correct_choice_direction, quality_teaching, 
                pay_level, participation_in_science, quality_of_events, relevance_of_information, 
                modern_equipment, objectivity_of_teachers, learning_outcomes, access_to_technology, 
                library_work, accessible_electronic_materials, psychological_support, canteen_work, 
                medical_service, teaching_staff, best_teacher, worst_teacher, positive, negative, 
                appearance, date_of_passage
                ) 
                values (
                :institution_name, :group, :form_of_education, :course,
                :correct_choice_organization, :correct_choice_direction, :quality_teaching,
                 :pay_level, :participation_in_science, :quality_of_events, :relevance_of_information,
                 :modern_equipment, :objectivity_of_teachers, :learning_outcomes, :access_to_technology,
                 :library_work, :accessible_electronic_materials, :psychological_support, :canteen_work,
                :medical_service, :teaching_staff, :best_teacher, :worst_teacher, :positive, :negative,
                :appearance, :date_of_passage 
                )
                """;

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource()
                .addValue("institution_name", organizationThroughUndergraduate.getInstitutionName())
                .addValue("group", organizationThroughUndergraduate.getGroup())
                .addValue("form_of_education", organizationThroughUndergraduate.getFormOfEducation())
                .addValue("course", organizationThroughUndergraduate.getCourse())
                .addValue("correct_choice_organization", organizationThroughUndergraduate.getCorrectChoiceOrganization())
                .addValue("correct_choice_direction", organizationThroughUndergraduate.getCorrectChoiceDirection())
                .addValue("quality_teaching", organizationThroughUndergraduate.getQualityTeaching())
                .addValue("pay_level", organizationThroughUndergraduate.getPayLevel())
                .addValue("participation_in_science", organizationThroughUndergraduate.getParticipationInScience())
                .addValue("quality_of_events", organizationThroughUndergraduate.getQualityOfEvents())
                .addValue("relevance_of_information", organizationThroughUndergraduate.getRelevanceOfInformation())
                .addValue("modern_equipment", organizationThroughUndergraduate.getModernEquipment())
                .addValue("objectivity_of_teachers", organizationThroughUndergraduate.getObjectivityOfTeachers())
                .addValue("learning_outcomes", organizationThroughUndergraduate.getLearningOutcomes())
                .addValue("access_to_technology", organizationThroughUndergraduate.getAccessToTechnology())
                .addValue("library_work", organizationThroughUndergraduate.getLibraryWork())
                .addValue("accessible_electronic_materials", organizationThroughUndergraduate.getAccessibleElectronicMaterials())
                .addValue("psychological_support", organizationThroughUndergraduate.getPsychologicalSupport())
                .addValue("canteen_work", organizationThroughUndergraduate.getCanteenWork())
                .addValue("medical_service", organizationThroughUndergraduate.getMedicalService())
                .addValue("teaching_staff", organizationThroughUndergraduate.getTeachingStaff())
                .addValue("best_teacher", organizationThroughUndergraduate.getBestTeacher())
                .addValue("worst_teacher", organizationThroughUndergraduate.getWorstTeacher())
                .addValue("positive", organizationThroughUndergraduate.getPositive())
                .addValue("negative", organizationThroughUndergraduate.getNegative())
                .addValue("appearance", organizationThroughUndergraduate.getAppearance())
                .addValue("date_of_passage", organizationThroughUndergraduate.getDateOfPassage()));
    }

    public Long countPassing() {
        String sql = """
                select max(id) from EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_UNDERGRADUATES
                """;

        return jdbcTemplate.queryForObject(sql, Long.class);
    }

    public List<String> getStaticColumn(String columnName) {
        String sql = """
                select %s from EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_UNDERGRADUATES
                """;

        return jdbcTemplate.queryForList(sql, String.class, columnName);
    }

    public List<Map<String, Object>> getStaticsWithCount(String columnName) {
        String sql =  "SELECT " + columnName + " AS value, COUNT(*) AS count " +
                "FROM EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_UNDERGRADUATES " +
                "GROUP BY " + columnName;
        return jdbcTemplate.queryForList(sql);
    }
}
