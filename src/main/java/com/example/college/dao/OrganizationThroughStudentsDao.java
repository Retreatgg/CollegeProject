package com.example.college.dao;

import com.example.college.model.OrganizationThroughStudents;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrganizationThroughStudentsDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void createOrganizationThroughStudents(OrganizationThroughStudents organizationThroughStudents) {
        String sql = """
                insert into EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_STUDENTS(
                    institution_name, group, form_of_education, level_of_study, course
                ) 
                VALUES (:institution_name, :group, :form_of_education, :level_of_study, :course)
                """;

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource()
                .addValue("institution_name", organizationThroughStudents.getInstitutionName())
                .addValue("group", organizationThroughStudents.getGroup())
                .addValue("form_of_education", organizationThroughStudents.getFormOfEducation())
                .addValue("level_of_study", organizationThroughStudents.getLevelOfStudy())
                .addValue("course", organizationThroughStudents.getCourse()));
    }
}