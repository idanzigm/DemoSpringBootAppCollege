package com.example.college.repo;

import com.example.college.models.registry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class repoRegistry implements repoRegistryInterface{

    @PersistenceContext
    private EntityManager entityManager;

    public List<registry> returnRegistry() {
        return entityManager.createQuery
                        ("SELECT j FROM registry j", registry.class)
                .getResultList();
    }

    @Override
    public void takeCourse(int studentId, int courseId) {

    }

    @Override
    public void dropCourse(int studentId, int courseId) {

    }
}
