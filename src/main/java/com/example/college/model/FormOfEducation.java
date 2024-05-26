package com.example.college.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "form_education")
public class FormOfEducation {

    @Id
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "formOfEducation")
    private List<OrganizationThroughStudents> organizationThroughStudents;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "formOfEducation")
    private List<OrganizationThroughUndergraduate> organizationThroughUndergraduates;
}
