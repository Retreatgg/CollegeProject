package com.example.college.dao;

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
public class LevelOfEducationDao {

    private final JdbcTemplate jdbcTemplate;

    public Optional<LevelOfEducation> getLevelOfEducationByName(String name) {
        String sql = """
                select name from LEVEL_OF_EDUCATION
                where NAME like ?;
                """;

        return Optional.ofNullable(
                DataAccessUtils.singleResult(
                        jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(LevelOfEducation.class), name)
                )
        );
    }

    public List<LevelOfEducation> getLevelsOfEducation() {
        String sql = """
                select * from level_of_education
                """;

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(LevelOfEducation.class));
    }
}
