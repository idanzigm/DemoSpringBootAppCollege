package com.example.college.repo;

import com.example.college.models.course;
import com.example.college.models.student;

import java.util.List;

public interface repoRegistryInterface {

    public List<course> returnRegistryByCourse();

    public List<student> returnRegistryByStudent();

    public void takeCourse(int studentId, int courseId);

    public void dropCourse(int studentId, int courseId);

}
