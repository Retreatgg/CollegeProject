package com.example.college.repository;

import com.example.college.model.SatisfactionRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SatisfactionRatingRepository extends JpaRepository<SatisfactionRating, Long> {
}
