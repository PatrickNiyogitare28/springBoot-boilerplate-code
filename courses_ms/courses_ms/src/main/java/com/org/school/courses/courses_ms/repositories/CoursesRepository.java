package com.org.school.courses.courses_ms.repositories;

import com.org.school.courses.courses_ms.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Course, Integer> {

}
