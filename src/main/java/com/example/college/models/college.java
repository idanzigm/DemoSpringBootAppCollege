package com.example.college.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "college")
public class college {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "college_id")
    private int id;

    @Column(name = "college_name", unique = true)
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<course> courses;

    public college() {
    }

    public college(String name) {
        this.name = name;
    }

    public college(int id, String name) {
        this.id = id;
        this.name = name;
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

    public List<course> getCourses() {
        return courses;
    }

    public void setCourses(List<course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "college{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
