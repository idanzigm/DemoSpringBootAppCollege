package com.example.college.repo;

import com.example.college.models.college;

import java.util.List;

public interface repoCollegeInterface {

    //========================CREATE=======================
    public void createCollege(college College);

    //========================READ=======================
    public college getCollegeById(int collegeId);

    public college getCollegeByName(String collegeName);

    public college getCollegeByCourse(int courseId);

    public List<college> getAllColleges();

    //========================UPDATE=======================
    public void updateCollege(college college);

    //========================DELETE=======================
    public void deleteCollege(int collegeId);
}
