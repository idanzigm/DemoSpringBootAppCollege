package com.example.college.repo;

import com.example.college.CollegeApplication;
import com.example.college.models.course;
import jakarta.transaction.Transactional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.springframework.test.annotation.DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD;

@DataJpaTest
@SpringJUnitConfig(classes = CollegeApplication.class)
@Transactional
@DirtiesContext(classMode = BEFORE_EACH_TEST_METHOD)
public class repoCatalogueTest {

    @Autowired
    private repoCatalogue testCatalogueRepository;
    @Autowired
    private repoCourse testCourseRepository;

    @Test
    public void givenNothing_whenReturnCatalogue_thenReturnCatalogue() {
        //given

        //when

        //then
    }

    @Test
    public void givenCollegeIdAndCourseId_whenAddCourse_thenReturnCourseEntry() {
        //given

        //when

        //then
    }

    @Test
    public void givenCollegeIdAndCourseId_whenRemoveCourse_thenReturnNothing() {
        //given

        //when

        //then
    }


}
