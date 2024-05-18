package com.example.college.service.impl;

import com.example.college.dao.SatisfactionRatingDao;
import com.example.college.dto.SatisfactionRatingCreateDto;
import com.example.college.model.SatisfactionRating;
import com.example.college.service.SatisfactionRatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class SatisfactionRatingServiceImpl implements SatisfactionRatingService {

    private final SatisfactionRatingDao satisfactionRatingDao;

    @Override
    public void createSatisfactionRating(SatisfactionRatingCreateDto rating) {
        SatisfactionRating satisfactionRating = new SatisfactionRating();

        satisfactionRating.setAcademicTitle(rating.getAcademicTitle());
        satisfactionRating.setIsEmployeeOfTheAdministration(rating.getIsEmployeeOfTheAdministration());
        satisfactionRating.setNameOfTheStructuralUnit(rating.getNameOfTheStructuralUnit());
        satisfactionRating.setDateOfPassage(LocalDateTime.now());

        satisfactionRatingDao.createSatisfactionRating(satisfactionRating);
    }


    @Override
    public List<String> getStaticColumn(String columnName) {
        return satisfactionRatingDao.getStaticColumn(columnName);
    }

    @Override
    public List<Map<String, Object>> getStaticWithCount(String columnName) {
        return satisfactionRatingDao.getStaticsWithCount(columnName);
    }
}
