package com.example.college.repo;

import com.example.college.models.course;
import com.example.college.models.registry;
import com.example.college.models.student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class repoStudent implements repoStudentInterface {

    @PersistenceContext
    private EntityManager entityManager;

    //========================CREATE========================
    @Override
    public int saveStudent(student Student) {
        try {
            entityManager.persist(Student);
            return 0;
        } catch (Exception e) {
            return 1;
        }
    }

    //========================READ========================
    @Override
    public student getStudentById(int studentId) {
        return entityManager.find(student.class, studentId);
    }

    @Override
    public List<student> getMyStudents(int courseId) {
        return entityManager.createQuery(
                        "SELECT s FROM student s JOIN s.courses c WHERE c.id = :course_id", student.class)
                .setParameter("course_id", courseId)
                .getResultList();
    }

    @Override
    public List<student> getMyStudentByName(int courseId, String studentName) {
        return entityManager.createQuery(
                        "SELECT s FROM student s JOIN s.courses c WHERE s.firstName = :first_name AND c.id = :course_id", student.class)
                .setParameter("first_name", studentName)
                .setParameter("course_id", courseId)
                .getResultList();
    }

    @Override
    public List<student> getAllStudents() {
        return entityManager.createQuery(
                        "SELECT s FROM student s", student.class)
                .getResultList();
    }

    //========================UPDATE========================
    @Override
    public int updateStudent(student Student, int StudentId) {
        student studentToUpdate = entityManager.find(student.class, StudentId);

        if (studentToUpdate != null) {
            studentToUpdate.setFirstName(Student.getFirstName());
            studentToUpdate.setLastName(Student.getLastName());

            entityManager.merge(studentToUpdate);
            return 0;
        }
        return 1;
    }

    //========================DELETE========================
    @Override
    public void dropOutStudentById(int studentId) {
        student Student = entityManager.find(student.class, studentId);
        if (Student != null) {
            entityManager.remove(Student);
        }
    }

}
