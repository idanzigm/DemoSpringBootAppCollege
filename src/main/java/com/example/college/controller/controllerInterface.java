package com.example.college.controller;

import com.example.college.models.college;
import com.example.college.models.course;
import com.example.college.models.student;

import java.util.List;

public interface controllerInterface {

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
