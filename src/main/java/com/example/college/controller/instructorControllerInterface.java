package com.example.college.controller;

import com.example.college.models.course;
import com.example.college.models.student;

import java.util.List;

public interface instructorControllerInterface {

    public List<student> getMyStudents(int courseId);

    public void addCourse(course Course);

    public void updateCourse(course Course);

    public void deleteCourse(course Course);
}
