package com.example.college.dao;

import com.example.college.model.Institution;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class InstitutionDao {

    private final JdbcTemplate jdbcTemplate;

    public Optional<Institution> getInstituteByName(String name) {
        String sql = """
                select * from INSTITUTIONS
                where name like ?
                """;

        return Optional.ofNullable(
                DataAccessUtils.singleResult(
                        jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Institution.class), name)
                )
        );
    }


    public List<Institution> getInstitutions() {
        String sql = """
                select * from institutions
                """;

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>());
    }
}
