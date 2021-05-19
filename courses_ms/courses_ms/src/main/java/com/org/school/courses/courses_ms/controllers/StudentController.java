package com.org.school.courses.courses_ms.controllers;

import com.org.school.courses.courses_ms.models.Student;
import com.org.school.courses.courses_ms.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/api/students")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/api/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/api/students/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/api/students/{id}")
    public Student updateStudent(@RequestBody Student newStudent, @PathVariable int id){
        return studentService.updateStudent(newStudent, id);
    }

    @DeleteMapping("/api/students/{id}")
    public String deleteStudent(@PathVariable int id){
        return studentService.deleteStudentById(id);
    }
}
