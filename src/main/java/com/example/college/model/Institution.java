package com.example.college.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "institutions")
public class Institution {

    @Id
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "institution")
    private List<OrganizationThroughStudents> organizationThroughStudents;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "institution")
    private List<OrganizationThroughUndergraduate> organizationThroughUndergraduates;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "institution")
    private List<TeacherThroughStudents> teacherThroughStudents;
}
