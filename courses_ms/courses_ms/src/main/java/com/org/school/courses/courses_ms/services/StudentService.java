package com.org.school.courses.courses_ms.services;

import com.org.school.courses.courses_ms.models.Student;
import com.org.school.courses.courses_ms.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
     @Autowired
     private StudentRepository studentRepository;

     public Student saveStudent(Student student){
         return studentRepository.save(student);
     }

     public List<Student> getAllStudents(){
         return studentRepository.findAll();
     }

     public Student getStudentById(int id){
         return studentRepository.findById(id).orElse(null);
     }

     public Student updateStudent(Student newStudent, int id){
         Student existing = getStudentById(id);
         if(existing == null)
              return null;
         existing.setName(newStudent.getName());
         existing.setEmail(newStudent.getEmail());
         existing.setGender(newStudent.getGender());
         existing.setAge(newStudent.getAge());
         return studentRepository.save(existing);
     }

     public String deleteStudentById(int id){
         Student existing = getStudentById(id);
         if(existing == null)
             return  null;
         studentRepository.deleteById(id);
         return "Successfully delete student "+id;
     }
}
