package com.example.college.repo;

import com.example.college.models.course;

import java.util.List;

public interface repoCourseInterface {

    //========================CREATE========================
    public void createCourse(course course, int collegeId);

    //========================READ========================
    public course getCourseById(int courseId);

    public List<course> getCoursesByName(String courseName);

    public List<course> getCoursesByStudent(int studentId);

    public List<course> getCoursesByCollege(int collegeId);

    public List<course> getAllCourses();

    //========================UPDATE========================
    public void updateCourse(course Course, int courseId);

    //========================DELETE=======================
    public void deleteCourse(int CourseId);
}
