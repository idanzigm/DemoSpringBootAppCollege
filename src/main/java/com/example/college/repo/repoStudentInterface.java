package com.example.college.repo;

import com.example.college.models.course;
import com.example.college.models.student;

import java.util.List;

public interface repoStudentInterface {

    //========================CREATE========================
    public int saveStudent(student Student);

    //========================READ========================
    public student getStudentById(int studentId);

    public List<student> getMyStudents(int courseId);

    public List<student> getMyStudentByName(int courseId, String studentName);

    public List<student> getAllStudents();

    //========================UPDATE========================
    public int updateStudent(student Student, int StudentId);

    //========================DELETE========================
    public void dropOutStudentById(int studentId);

}
