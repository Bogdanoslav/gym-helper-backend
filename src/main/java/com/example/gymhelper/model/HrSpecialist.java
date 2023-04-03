package com.example.gymhelper.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hr_specialist")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HrSpecialist extends User{
    @Column(name = "experience")
    private Integer experience;
}
