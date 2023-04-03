package com.example.gymhelper.repo;


import com.example.gymhelper.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
