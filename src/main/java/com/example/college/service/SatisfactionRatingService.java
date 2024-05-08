package com.example.college.service;

import com.example.college.dto.SatisfactionRatingCreateDto;
import com.example.college.model.SatisfactionRating;
import org.springframework.stereotype.Service;

@Service
public interface SatisfactionRatingService {

    void createSatisfactionRating(SatisfactionRatingCreateDto rating);
}
