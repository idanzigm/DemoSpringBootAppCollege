package com.example.college.repo;

import com.example.college.models.registry;

import java.util.List;

public interface repoRegistryInterface {

    public List<registry> returnRegistry();

    public void takeCourse(int studentId, int courseId);

    public void dropCourse(int studentId, int courseId);

}
