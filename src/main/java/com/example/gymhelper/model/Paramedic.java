package com.example.gymhelper.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "paramedic")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paramedic extends User{
    @Column(name = "experience")
    private Integer experience;

    @Column(name = "qualifications")
    private String qualifications;
}