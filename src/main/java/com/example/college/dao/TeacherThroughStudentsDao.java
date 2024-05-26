package com.example.college.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class TeacherThroughStudentsDao {

    private final JdbcTemplate jdbcTemplate;

    public Long countPassing() {
        String sql = """
                select max(id) from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT
                """;

        return jdbcTemplate.queryForObject(sql, Long.class);
    }

    public List<String> getStaticColumn(String columnName) {
        String sql = """
                select %s from TEACHER_THROUGH_THE_EYES_OF_A_STUDENT
                """;

        return jdbcTemplate.queryForList(sql, String.class, columnName);
    }

    public List<Map<String, Object>> getStaticsWithCount(String columnName) {
        String totalCountQuery = "SELECT COUNT(*) FROM TEACHER_THROUGH_THE_EYES_OF_A_STUDENT";
        int totalCount = jdbcTemplate.queryForObject(totalCountQuery, Integer.class);

        String sql = "SELECT " + columnName + ", (COUNT(*) * 100 / ?) AS percentage " +
                "FROM TEACHER_THROUGH_THE_EYES_OF_A_STUDENT " +
                "GROUP BY " + columnName;

        return jdbcTemplate.query(sql, new Object[]{totalCount}, (rs, rowNum) -> {
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put(columnName, rs.getString(columnName));
            resultMap.put("percentage", rs.getDouble("percentage"));
            return resultMap;
        });
    }
}
