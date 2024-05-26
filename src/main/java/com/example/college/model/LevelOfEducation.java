package com.example.college.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "level_of_education")
public class LevelOfEducation {
    @Id
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "levelOfStudy")
    private List<OrganizationThroughStudents> organizationThroughStudents;
}
