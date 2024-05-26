package com.example.college.util;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ServiceUtil {

    public static List<Map<String, Object>> buildResultList(String columnName, int totalCount, Map<Integer, Integer> resultMap) {
        List<Map<String, Object>> resultList = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            int count = resultMap.getOrDefault(i, 0);
            double percentage = totalCount > 0 ? (count * 100.0 / totalCount) : 0;

            Map<String, Object> map = new HashMap<>();
            map.put(columnName, i);
            map.put("percentage", percentage);
            resultList.add(map);
        }
        return resultList;
    }


}
