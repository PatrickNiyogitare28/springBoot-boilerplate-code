package com.org.school.courses.courses_ms.services;

import com.org.school.courses.courses_ms.models.Marks;
import com.org.school.courses.courses_ms.repositories.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarksService {
    @Autowired
    private MarksRepository marksRepository;

    public Marks saveMarks(Marks marks) {
        return marksRepository.save(marks);
    }

    public List<Marks> getAllMarks() {
        return marksRepository.findAll();
    }

    public Marks getMarksById(int id) {
        return marksRepository.findById(id).orElse(null);
    }

    public Marks updateMarks(Marks newMarks, int id) {
        Marks existing = getMarksById(id);
        if (existing == null)
            return null;
        existing.setCourse(newMarks.getCourse());
        existing.setStudent(newMarks.getStudent());
        existing.setScores(newMarks.getScores());
        existing.setMaximum(newMarks.getMaximum());
        return marksRepository.save(existing);
    }

    public String deleteMarksById(int id){
        Marks existing = getMarksById(id);
        if(existing == null)
             return null;
         marksRepository.deleteById(id);
         return "Successfully deleted marks "+id;
    }
}