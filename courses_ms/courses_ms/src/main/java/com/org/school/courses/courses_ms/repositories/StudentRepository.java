package com.org.school.courses.courses_ms.repositories;

import com.org.school.courses.courses_ms.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
