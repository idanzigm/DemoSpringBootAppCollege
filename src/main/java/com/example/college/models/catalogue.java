package com.example.college.models;

import jakarta.persistence.*;

public class catalogue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="college_id")
    private college College;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private course Course;

    public catalogue() {
    }

    public catalogue(college college, course course) {
        College = college;
        Course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public college getCollege() {
        return College;
    }

    public void setCollege(college college) {
        College = college;
    }

    public course getCourse() {
        return Course;
    }

    public void setCourse(course course) {
        Course = course;
    }

    @Override
    public String toString() {
        return "catalogue{" +
                "id=" + id +
                ", College=" + College +
                ", Course=" + Course +
                '}';
    }
}
