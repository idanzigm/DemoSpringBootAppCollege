package com.example.college.service;

import com.example.college.models.course;
import com.example.college.models.student;

import java.util.List;

public interface serviceInterface {

    public void saveStudent(student Student);

    public student getMyStudentById(int studentId);

    public List<student> getMyStudents(int courseId);

    public void dropOutStudentById(int studentId);

    public void updateStudent(student Student);

    //=======================================================================

    public List<course> getCoursesByStudent(int studentId);

    public List<course> getCoursesByCollege(String college);

    public course getCourseById(int courseId);

    public void dropCourse(int studentId, int courseId);

    public void takeCourse(int studentId, int courseId);

    public void addCourse(course Course);

    public void updateCourse(course Course);
}
