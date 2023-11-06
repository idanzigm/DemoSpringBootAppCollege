package com.example.college.models;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "course")
@Table(name = "course")
public class course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="course_id")
    private int id;

    @Column(name = "course_name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "college_id")
    private college college;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<student> students;

    public course() {
    }

    public course(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public course(String name, String description, college college) {
        this.name = name;
        this.description = description;
        this.college = college;
    }

    public course(int id, String name, String description, college college) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public college getCollege() {
        return college;
    }

    public void setCollege(college college) {
        this.college = college;
    }

    public List<student> getStudents() {
        return students;
    }

    public void setStudents(List<student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", collegeName=" +
                '}';
    }
}
