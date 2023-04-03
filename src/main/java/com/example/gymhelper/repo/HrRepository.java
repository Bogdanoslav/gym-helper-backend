package com.example.gymhelper.repo;

import com.example.gymhelper.model.HrSpecialist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HrRepository extends JpaRepository<HrSpecialist, Long> {
}
