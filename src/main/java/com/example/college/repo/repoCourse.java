package com.example.college.repo;

import com.example.college.models.college;
import com.example.college.models.course;
import com.example.college.models.student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class repoCourse implements repoCourseInterface{

    @PersistenceContext
    private EntityManager entityManager;


    //========================CREATE========================

    @Override
    public void createCourse(course course, int collegeId) {
        college college = entityManager.find(college.class, collegeId);
        System.out.println(college.toString());

        if (college != null) {
            course.setCollege(college);
            entityManager.persist(course);
        }
    }

    //========================READ========================
    @Override
    public course getCourseById(int courseId) {
        return entityManager.find(course.class, courseId);
    }

    @Override
    public List<course> getCoursesByName(String courseName) {
        return entityManager.createQuery(
                        "SELECT c FROM course c WHERE c.name = :course_name", course.class)
                .setParameter("course_name", courseName)
                .getResultList();
    }
    @Override
    public List<course> getCoursesByStudent(int studentId) {
        return entityManager.createQuery(
                        "SELECT c FROM course c JOIN c.students s WHERE s.id = :student_id", course.class)
                .setParameter("student_id", studentId)
                .getResultList();
    }

    @Override
    public List<course> getCoursesByCollege(int collegeId) {
        college college = entityManager.find(college.class, collegeId);
        if (college != null) {
            return entityManager.createQuery(
                        "SELECT c FROM course c WHERE c.college = :college", course.class)
                .setParameter("college", college)
                .getResultList();
        }
        return null;
    }

    @Override
    public List<course> getAllCourses() {
        return entityManager.createQuery(
                        "SELECT c FROM course c", course.class)
                .getResultList();
    }

    //========================UPDATE========================

    @Override
    public void updateCourse(course Course, int courseId) {
        course courseToUpdate = entityManager.find(course.class, courseId);

        if (courseToUpdate != null) {
            courseToUpdate.setName(Course.getName());
            courseToUpdate.setDescription(Course.getDescription());

            entityManager.merge(courseToUpdate);
        }
    }

    //========================DELETE=======================

    @Override
    public void deleteCourse(int CourseId) {
        course course = entityManager.find(course.class, CourseId);
        if (course != null) {
            entityManager.remove(course);
        }
    }
}
