package com.example.gymhelper.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "client")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client extends User {

    @Column(name = "health_problems")
    private String healthProblems;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;
}

