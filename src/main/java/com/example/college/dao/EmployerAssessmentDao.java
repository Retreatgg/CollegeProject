package com.example.college.dao;

import com.example.college.model.EmployerAssessment;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class EmployerAssessmentDao {

    private final JdbcTemplate jdbcTemplate;

    public Long countPassing() {
        String sql = """
                select max(id) from EMPLOYER_ASSESSMENT
                """;

        return jdbcTemplate.queryForObject(sql, Long.class);
    }

    public List<String> getStaticColumn(String columnName) {
        String sql = "SELECT " + columnName + " FROM EMPLOYER_ASSESSMENT";

        return jdbcTemplate.queryForList(sql, String.class);
    }

    public List<Map<String, Object>> getStaticsWithCount(String columnName) {
        String totalCountQuery = "SELECT COUNT(*) FROM EMPLOYER_ASSESSMENT";
        int totalCount = jdbcTemplate.queryForObject(totalCountQuery, Integer.class);

        String sql = "SELECT " + columnName + ", (COUNT(*) * 100 / ?) AS percentage " +
                "FROM EMPLOYER_ASSESSMENT " +
                "GROUP BY " + columnName;

        return jdbcTemplate.query(sql, new Object[]{totalCount}, (rs, rowNum) -> {
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put(columnName, rs.getString(columnName));
            resultMap.put("percentage", rs.getDouble("percentage"));
            return resultMap;
        });

    }
}
