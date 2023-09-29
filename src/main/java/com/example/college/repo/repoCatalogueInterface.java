package com.example.college.repo;

import com.example.college.models.registry;

import java.util.List;

public interface repoCatalogueInterface {

    public List<registry> returnCatalogue();

    public void addCourse(int collegeId, int courseId);

    public void removeCourse(int collegeId, int courseId);
}
