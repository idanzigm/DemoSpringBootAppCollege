package com.example.college.service;

import com.example.college.models.course;
import com.example.college.models.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service implements serviceInterface {

    private com.example.college.repo.repoStudent repoStudent;

    @Autowired
    service(com.example.college.repo.repoStudent repoStudent) {
        this.repoStudent = repoStudent;
    }


    @Override
    public void saveStudent(student Student) {

    }

    @Override
    public student getMyStudentById(int studentId) {
        return null;
    }

    @Override
    public List<student> getMyStudents(int courseId) {
        return null;
    }

    @Override
    public void dropOutStudentById(int studentId) {

    }

    @Override
    public void updateStudent(student Student) {

    }

    @Override
    public List<course> getCoursesByStudent(int studentId) {
        return null;
    }

    @Override
    public List<course> getCoursesByCollege(String college) {
        return null;
    }

    @Override
    public course getCourseById(int courseId) {
        return null;
    }

    @Override
    public void dropCourse(int studentId, int courseId) {

    }

    @Override
    public void takeCourse(int studentId, int courseId) {

    }

    @Override
    public void addCourse(course Course) {

    }

    @Override
    public void updateCourse(course Course) {

    }
}
