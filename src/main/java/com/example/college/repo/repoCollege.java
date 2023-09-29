package com.example.college.repo;

import com.example.college.models.college;
import com.example.college.models.course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class repoCollege implements repoCollegeInterface{

    @PersistenceContext
    private EntityManager entityManager;

    //========================Create=======================
    @Override
    public void createCollege(college College) {

    }

    //========================READ=======================

    @Override
    public college getCollegeById(int collegeId) {
        return null;
    }

    @Override
    public college getCollegeByName(String collegeName) {
        return null;
    }

    @Override
    public college getCollegeByCourse(int courseId) {
        return null;
    }

    @Override
    public List<college> getAllColleges() {
        return null;
    }

    //========================UPDATE=======================
    @Override
    public void updateCollege(college college) {

    }

    //========================DELETE=======================

    @Override
    public void deleteCollege(int collegeId) {

    }


}
