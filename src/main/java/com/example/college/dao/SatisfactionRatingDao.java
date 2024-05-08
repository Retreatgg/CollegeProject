package com.example.college.dao;


import com.example.college.model.SatisfactionRating;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SatisfactionRatingDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final JdbcTemplate jdbcTemplate;

    public void createSatisfactionRating(SatisfactionRating satisfactionRating) {
        String sql = """
                insert into SATISFACTION_RATING(name_of_the_structural_unit, is_employee_of_the_administration, academic_title) 
                values ( :name_of_structural_unit, :is_employee_of_the_administration, :academic_title);
                """;

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource()
                .addValue("name_of_structural_unit", satisfactionRating.getNameOfTheStructuralUnit())
                .addValue("is_employee_of_the_administration", satisfactionRating.getIsEmployeeOfTheAdministration())
                .addValue("academic_title", satisfactionRating.getAcademicTitle()));
    }

    public Long countPassing() {
        String sql = """
                select max(id) from SATISFACTION_RATING
                """;

        return jdbcTemplate.queryForObject(sql, Long.class);
    }
}
