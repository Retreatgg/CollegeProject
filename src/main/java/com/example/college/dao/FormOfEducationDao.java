package com.example.college.dao;

import com.example.college.model.FormOfEducation;
import com.example.college.model.LevelOfEducation;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FormOfEducationDao {

    private final JdbcTemplate jdbcTemplate;

    public Optional<FormOfEducation> getFormOfEducationByName(String name) {
        String sql = """
                select * from FORM_EDUCATION
                where NAME like ?;
                """;

        return Optional.ofNullable(
                DataAccessUtils.singleResult(
                        jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(FormOfEducation.class), name)
                )
        );
    }

    public List<FormOfEducation> getLevelsOfEducation() {
        String sql = """
                select * from FORM_EDUCATION
                """;

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(FormOfEducation.class));
    }
}
