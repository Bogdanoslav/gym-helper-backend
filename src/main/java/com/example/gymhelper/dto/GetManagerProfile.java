package com.example.gymhelper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class GetManagerProfile {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private LocalDate birthday;
    private Integer experience;
}
