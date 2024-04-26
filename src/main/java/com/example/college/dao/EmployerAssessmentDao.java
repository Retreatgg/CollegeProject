package com.example.college.dao;

import com.example.college.model.EmployerAssessment;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmployerAssessmentDao {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void createEmployerAssessment(EmployerAssessment assessment) {
        String sql = """
                insert into EMPLOYER_ASSESSMENT(educational_programs, start_year_cooperation) 
                values (:educational_programs, :start_year_cooperation)
                """;

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource()
                .addValue("educational_programs", assessment.getEducationalPrograms())
                .addValue("start_year_cooperation", assessment.getStartYearCooperation()));
    }
}
