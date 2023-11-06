package com.example.college.repo;

import com.example.college.CollegeApplication;
import com.example.college.models.college;
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

import java.util.List;

import static org.springframework.test.annotation.DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD;

@DataJpaTest
@SpringJUnitConfig(classes = CollegeApplication.class)
@Transactional
@DirtiesContext(classMode = BEFORE_EACH_TEST_METHOD)
public class repoCollegeTest {

    @Autowired
    private repoCollege testCollegeRepository;
    @Autowired
    private repoCourse testCourseRepository;

    @Test
    public void givenNothing_whenReturnCatalogue_thenReturnCatalogue() {
        //given

        //when
        List<college> colleges = testCollegeRepository.returnCatalogue();

        //then
        for (college college : colleges) {
            System.out.println(college.getName());
            for (course course : college.getCourses()) {
                System.out.println(course.toString());
            }
        }

    }


}
