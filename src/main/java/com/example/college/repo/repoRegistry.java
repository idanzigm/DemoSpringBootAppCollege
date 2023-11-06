package com.example.college.repo;

import com.example.college.models.course;
import com.example.college.models.student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import java.util.Iterator;

import java.util.List;

@Repository
@Transactional
public class repoRegistry implements repoRegistryInterface{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<course> returnRegistryByCourse() {
        return entityManager.createQuery
                        ("SELECT c FROM course c JOIN FETCH c.students", course.class)
                .getResultList();
    }

    @Override
    public List<student> returnRegistryByStudent() {
        return entityManager.createQuery
                        ("SELECT s FROM student s JOIN FETCH s.courses", student.class)
                .getResultList();
    }

    @Override
    public void takeCourse(int studentId, int courseId) {
        student Student = entityManager.find(student.class, studentId);
        course Course = entityManager.find(course.class, courseId);

        for (student student : Course.getStudents()) {
            if (Student.getId() == student.getId()) {
                return;
            }
        }

        for (course course : Student.getCourses()) {
            if (Course == course) {
                return;
            }
        }

        Course.getStudents().add(Student);
        Student.getCourses().add(Course);

        entityManager.merge(Course);
        entityManager.merge(Student);
    }

    @Override
    public void dropCourse(int studentId, int courseId) {
        student Student = entityManager.find(student.class, studentId);
        course Course = entityManager.find(course.class, courseId);

        Course.getStudents().removeIf(student -> student.equals(Student));
        Student.getCourses().removeIf(course -> course.equals(Course));

        entityManager.merge(Course);
        entityManager.merge(Student);
    }
}
