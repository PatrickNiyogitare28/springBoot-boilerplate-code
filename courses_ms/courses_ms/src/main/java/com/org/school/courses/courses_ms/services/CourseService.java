package com.org.school.courses.courses_ms.services;

import com.org.school.courses.courses_ms.models.Course;
import com.org.school.courses.courses_ms.repositories.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CoursesRepository coursesRepository;

    /*
     @Role : create a course
     @Todo : test if courses exist
    */
    public Course createCourse(Course course){
        return coursesRepository.save(course);
    }

    /*
     @Role : get all courses
    */
    public List<Course> getCourses(){
        return coursesRepository.findAll();
    }

    /*
     @Role : get one course by id
    */
    public Course getCourseById(int id){
        return coursesRepository.findById(id).orElse(null);
    }

    /*
     @Role : create a course
     @Todo : check, return 404 for not existing
    */
    public Course updateCourse(Course newCourse, int id){
        Course existing = getCourseById(id);
        if(existing == null){
            return null;
        }
        existing.setName(newCourse.getName());
        existing.setCourseCode(newCourse.getCourseCode());
        return coursesRepository.save(existing);
    }


    /*
     @Role : create a course
     @Todo : update other relations
    */
    public String deleteCourse(int id){
        Course existing = getCourseById(id);
        if(existing == null){
            return null;
        }
        coursesRepository.deleteById(id);
        return "Successfully deleted course "+id;
    }

}
