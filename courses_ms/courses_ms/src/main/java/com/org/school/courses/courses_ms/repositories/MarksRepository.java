package com.org.school.courses.courses_ms.repositories;

import com.org.school.courses.courses_ms.models.Marks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarksRepository extends JpaRepository<Marks, Integer> {
}
