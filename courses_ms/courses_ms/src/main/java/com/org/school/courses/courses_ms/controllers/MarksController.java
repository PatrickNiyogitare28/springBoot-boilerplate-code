package com.org.school.courses.courses_ms.controllers;

import com.org.school.courses.courses_ms.models.Marks;
import com.org.school.courses.courses_ms.services.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarksController {
    @Autowired
    private MarksService marksService;

    @PostMapping("/api/marks")
    public Marks saveMarks(@RequestBody Marks marks){
        return marksService.saveMarks(marks);
    }

    @GetMapping("/api/marks")
    public List<Marks> getAllMarks(){
        return marksService.getAllMarks();
    }

    @GetMapping("/api/marks/{id}")
    public Marks getMarksById(@PathVariable int id){
        return marksService.getMarksById(id);
    }

    @PutMapping("/api/marks/{id}")
    public Marks updateMarks(@RequestBody Marks marks, @PathVariable int id){
        return marksService.updateMarks(marks, id);
    }

    @DeleteMapping("/api/marks/{id}")
    public String deleteMarks(@PathVariable int id){
        return marksService.deleteMarksById(id);
    }
}

