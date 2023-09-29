package com.example.college.models;

import jakarta.persistence.*;

@Entity(name = "registry")
@Table(name = "registry")
public class registry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="student_id")
    private student Student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private course Course;

    public registry() {
    }

    public registry(student student, course course) {
        Student = student;
        Course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public student getStudent() {
        return Student;
    }

    public void setStudent(student student) {
        Student = student;
    }

    public course getCourse() {
        return Course;
    }

    public void setCourse(course course) {
        Course = course;
    }

    @Override
    public String toString() {
        return "registry{" +
                "id=" + id +
                ", Student=" + Student +
                ", Course=" + Course +
                '}';
    }
}
