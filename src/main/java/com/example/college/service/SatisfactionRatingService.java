package com.example.college.service;

import com.example.college.dto.SatisfactionRatingCreateDto;
import com.example.college.model.SatisfactionRating;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface SatisfactionRatingService {

    void createSatisfactionRating(SatisfactionRatingCreateDto rating);

    List<String> getStaticColumn(String columnName);

    List<Map<String, Object>> getStaticWithCount(String columnName);
}
