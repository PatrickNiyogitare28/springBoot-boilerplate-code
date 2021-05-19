package com.org.school.courses.courses_ms.controllers;

import com.org.school.courses.courses_ms.models.Course;
import com.org.school.courses.courses_ms.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    /*
     @Role : controller to the create method
    */
    @PostMapping("/api/courses")
    public Course createCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }

    /*
     @Role : controller to get all courses
    */
    @GetMapping("/api/courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    /*
     @Role : controller to get course by id
    */
    @GetMapping("/api/courses/{id}")
    public Course getCourseById(@PathVariable int id){
        return courseService.getCourseById(id);
    }

    /*
     @Role : controller to update course by id
    */
    @PutMapping("/api/courses/{id}")
    public Course updateCourse(@RequestBody Course newCourse, @PathVariable int id){
        return courseService.updateCourse(newCourse,id);
    }

    @DeleteMapping("/api/courses/{id}")
    public String deleteCourse(@PathVariable int id){
        return courseService.deleteCourse(id);
    }

}
