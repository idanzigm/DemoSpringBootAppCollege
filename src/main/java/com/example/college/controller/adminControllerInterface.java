package com.example.college.controller;

import com.example.college.models.college;

public interface adminControllerInterface {

    public void addCollege(college College);

    public void getCollegeById(int collegeId);

    public void updateCollege(college College);

    public void deleteCollege(int collegeId);
}
