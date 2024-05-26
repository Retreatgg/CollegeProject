package com.example.college.repository;

import com.example.college.model.OrganizationThroughUndergraduate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationThroughUndergraduateRepository extends JpaRepository<OrganizationThroughUndergraduate, Long> {
}
