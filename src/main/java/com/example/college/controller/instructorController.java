package com.example.college.controller;

import com.example.college.models.course;
import com.example.college.models.student;
import com.example.college.service.instructorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class instructorController implements instructorControllerInterface{

    @Autowired
    private instructorService instructorService;

    @Override
    public List<student> getMyStudents(int courseId) {
        return null;
    }

    @Override
    public void addCourse(course Course) {

    }

    @Override
    public void updateCourse(course Course) {

    }

    @Override
    public void deleteCourse(course Course) {

    }
}
