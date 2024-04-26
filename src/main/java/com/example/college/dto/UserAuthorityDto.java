package com.example.college.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserAuthorityDto {

    private String userEmail;
    private Long roleId;
}
