package com.example.college.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class OrganizationThroughUndergraduateDao {

    private final JdbcTemplate jdbcTemplate;

    public Integer countPassing() {
        String sql = """
                select max(id) from EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_UNDERGRADUATES
                """;

        Integer result = jdbcTemplate.queryForObject(sql, Integer.class);
        return Optional.ofNullable(result).orElse(0);
    }

    public List<String> getStaticColumn(String columnName) {
        String sql = """
                select %s from EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_UNDERGRADUATES
                """;

        return jdbcTemplate.queryForList(sql, String.class, columnName);
    }

    public Map<Integer, Integer> getStaticsWithCount(String columnName) {
        String sql = "SELECT " + columnName + ", COUNT(*) " +
                "FROM EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_UNDERGRADUATES " +
                "GROUP BY " + columnName;

        Map<Integer, Integer> resultMap = new HashMap<>();
        jdbcTemplate.query(sql, (rs, rowNum) -> {
            int value = rs.getInt(columnName);
            int count = rs.getInt(2);
            resultMap.put(value, count);
            return null;
        });
        return resultMap;
    }
}
