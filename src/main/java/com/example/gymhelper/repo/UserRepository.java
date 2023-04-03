package com.example.gymhelper.repo;


import com.example.gymhelper.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Person, Long> {
}
