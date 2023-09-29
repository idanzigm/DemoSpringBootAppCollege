package com.example.college.repo;

import com.example.college.models.registry;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class repoCatalogue implements repoCatalogueInterface{
    @Override
    public List<registry> returnCatalogue() {
        return null;
    }

    @Override
    public void addCourse(int collegeId, int courseId) {

    }

    @Override
    public void removeCourse(int collegeId, int courseId) {

    }
}
