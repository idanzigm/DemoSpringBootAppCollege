package com.example.college.service;

import com.example.college.models.college;
import com.example.college.models.course;
import com.example.college.models.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {

    private com.example.college.repo.repoStudent repoStudent;

    @Autowired
    studentService(com.example.college.repo.repoStudent repoStudent) {
        this.repoStudent = repoStudent;
    }


    public void saveStudent(student Student) {

    }

    public student getStudentById(int studentId) {
        return null;
    }

    public void dropOutStudentById(int studentId) {

    }

    public course getCourseById(int courseId) {
        return null;
    }

    public college getCollegeById(int collegeId) {return null;}

    public void dropCourse(int studentId, int courseId) {

    }

    public void takeCourse(int studentId, int courseId) {

    }

    public void addCourse(course Course) {

    }

    public void updateCourse(course Course) {

    }
}
