package com.example.gymhelper.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "client")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client extends Person {

    @Column(name = "health_problems")
    private String healthProblems;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;
}

