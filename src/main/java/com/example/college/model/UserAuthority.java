package com.example.college.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user_authority")
public class UserAuthority {

    @Id
    private String userEmail;
    @Id
    private Long roleId;
}
