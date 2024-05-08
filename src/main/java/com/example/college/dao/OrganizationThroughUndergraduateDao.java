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

@Component
@RequiredArgsConstructor
public class OrganizationThroughUndergraduateDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final JdbcTemplate jdbcTemplate;

    public void createOrganizationThroughUndergraduate(OrganizationThroughUndergraduate organizationThroughUndergraduate){
        String sql = """
                insert into EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_UNDERGRADUATES(
                    institution_name, group, form_of_education, course
                ) 
                values (:institution_name, :group, :form_of_education, :course)
                """;

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource()
                .addValue("institution_name", organizationThroughUndergraduate.getInstitutionName())
                .addValue("group", organizationThroughUndergraduate.getGroup())
                .addValue("form_of_education", organizationThroughUndergraduate.getFormOfEducation())
                .addValue("course", organizationThroughUndergraduate.getCourse()));
    }

    public Long countPassing() {
        String sql = """
                select max(id) from EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_UNDERGRADUATES
                """;

        return jdbcTemplate.queryForObject(sql, Long.class);
    }

    public List<TeacherThroughStudents> getResultsByInstitute() {
        String sql = """
                select * from EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_UNDERGRADUATES group by INSTITUTION_NAME
                """;

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(TeacherThroughStudents.class));
    }
}
