package com.example.college.repo;

import com.example.college.CollegeApplication;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.springframework.test.annotation.DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD;

@DataJpaTest
@ExtendWith(SpringExtension.class)
@SpringJUnitConfig(classes = CollegeApplication.class)
@Transactional
@DirtiesContext(classMode = BEFORE_EACH_TEST_METHOD)
public class repoRegistryTest {

    @Autowired
    private repoRegistry testRegistryRepository;

    //==========================================================

    @Test
    public void givenNothing_whenReturnRegistry_thenReturnRegistry() {
        //given

        //when

        //then
    }

    @Test
    public void givenCourseIdAndStudentId_whenTakeCourse_thenReturnRegistryEntry() {
        //given

        //when

        //then
    }

    @Test
    public void givenCourseIdAndStudentId_whenDropCourse_thenReturnNothing() {
        //given

        //when

        //then
    }

}
