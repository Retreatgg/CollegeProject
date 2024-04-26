package com.example.college.dao;

import com.example.college.model.OrganizationThroughUndergraduate;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrganizationThroughUndergraduateDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

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
}
