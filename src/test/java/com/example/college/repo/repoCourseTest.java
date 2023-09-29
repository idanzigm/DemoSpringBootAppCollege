package com.example.college.repo;

import com.example.college.CollegeApplication;
import com.example.college.models.course;
import com.example.college.models.student;
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
@ExtendWith(SpringExtension.class)
@SpringJUnitConfig(classes = CollegeApplication.class)
@Transactional
@DirtiesContext(classMode = BEFORE_EACH_TEST_METHOD)
public class repoCourseTest {

    @Autowired
    private repoCourse testCourseRepository;
    @Autowired
    private repoCollege testCollegeRepository;

    //======================================================
    //========================CREATE========================
    //=======================================================

//  ========================SaveCourse========================
@Test
public void givenCourseAndCollegeId_whenCreateCourse_thenReturnCreatedCourse() {
    //given
    course testCourse1 = new course("Statistics", "Determining P values and understanding peer review");
    course testCourse2 = new course("American History", "American History from 1800 to 1900");
    course testCourse3 = new course("Game Theory", "Understanding competition in markets with unideal information");

    int collegeId1 = 1;
    int collegeId2 = 2;
    int collegeId3 = 3;

    //when
    testCourseRepository.createCourse(testCourse1, collegeId1);
    testCourseRepository.createCourse(testCourse2, collegeId2);
    testCourseRepository.createCourse(testCourse3, collegeId3);

    //then
    Assertions.assertThat(testCourseRepository.getCourseById(9)).isNotNull();
    Assertions.assertThat(testCourseRepository.getCourseById(9).getName()).isEqualTo(testCourse1.getName());
    Assertions.assertThat(testCourseRepository.getCourseById(9).getDescription()).isEqualTo(testCourse1.getDescription());
    Assertions.assertThat(testCourseRepository.getCourseById(9).getCollege().getId()).isEqualTo(collegeId1);

    Assertions.assertThat(testCourseRepository.getCourseById(10)).isNotNull();
    Assertions.assertThat(testCourseRepository.getCourseById(10).getName()).isEqualTo(testCourse2.getName());
    Assertions.assertThat(testCourseRepository.getCourseById(10).getDescription()).isEqualTo(testCourse2.getDescription());
    Assertions.assertThat(testCourseRepository.getCourseById(10).getCollege().getId()).isEqualTo(collegeId2);

    Assertions.assertThat(testCourseRepository.getCourseById(11)).isNotNull();
    Assertions.assertThat(testCourseRepository.getCourseById(11).getName()).isEqualTo(testCourse3.getName());
    Assertions.assertThat(testCourseRepository.getCourseById(11).getDescription()).isEqualTo(testCourse3.getDescription());
    Assertions.assertThat(testCourseRepository.getCourseById(11).getCollege().getId()).isEqualTo(collegeId3);
}

    //======================================================
    //========================Read========================
    //=======================================================

//  ========================GetCourseById========================
    @Test
    public void givenCourseId_getCourseById_thenReturnCourse() {
        //given
        int courseId = 5;

        //when
        course returnedCourse = testCourseRepository.getCourseById(courseId);

        //then
        Assertions.assertThat(returnedCourse).isNotNull();
        Assertions.assertThat(returnedCourse.getName()).isEqualTo("Epistemology");
        Assertions.assertThat(returnedCourse.getDescription()).isEqualTo("Modern Foundationalism, Coherentism, and Infinitism");
        Assertions.assertThat(returnedCourse.getCollege().getId()).isEqualTo(2);
    }

//  ========================GetCoursesById========================
    @Test
    public void givenCourseName_whenGetCoursesByName_thenReturnCourses() {
        //given
        String courseName = "Calculus";

        //when
        List<course> courses = testCourseRepository.getCoursesByName(courseName);

        //then
        Assertions.assertThat(courses.get(0)).isNotNull();
        Assertions.assertThat(courses.get(0).getId()).isEqualTo(1);
        Assertions.assertThat(courses.get(0).getName()).isEqualTo("Calculus");
        Assertions.assertThat(courses.get(0).getDescription()).isEqualTo("Derivatives, Integration, and Infinite Series");
        Assertions.assertThat(courses.get(0).getCollege().getId()).isEqualTo(1);

        Assertions.assertThat(courses.get(1)).isNotNull();
        Assertions.assertThat(courses.get(1).getId()).isEqualTo(8);
        Assertions.assertThat(courses.get(1).getName()).isEqualTo("Calculus");
        Assertions.assertThat(courses.get(1).getDescription()).isEqualTo("Derivatives, Integration, and Infinite Series");
        Assertions.assertThat(courses.get(1).getCollege().getId()).isEqualTo(1);
    }

//  ========================GetCoursesByStudent========================
    @Test
    public void givenStudentId_whenGetCoursesByStudent_thenReturnCourses() {
        //given
        int studentId = 5;

        //when
        List<course> courses = testCourseRepository.getCoursesByStudent(studentId);

        //then
        Assertions.assertThat(courses.get(0)).isNotNull();
        Assertions.assertThat(courses.get(0).getId()).isEqualTo(3);

        Assertions.assertThat(courses.get(1)).isNotNull();
        Assertions.assertThat(courses.get(1).getId()).isEqualTo(6);

        Assertions.assertThat(courses.get(2)).isNotNull();
        Assertions.assertThat(courses.get(2).getId()).isEqualTo(7);
    }

//  ========================GetCoursesByCollege========================
    @Test
    public void givenCollegeId_whenGetCoursesByCollege_thenReturnCourses() {
        //given
        int collegeId = 2;

        //when
        List<course> courses = testCourseRepository.getCoursesByCollege(collegeId);

        //then
        Assertions.assertThat(courses.get(0)).isNotNull();
        Assertions.assertThat(courses.get(0).getId()).isEqualTo(3);

        Assertions.assertThat(courses.get(1)).isNotNull();
        Assertions.assertThat(courses.get(1).getId()).isEqualTo(4);

        Assertions.assertThat(courses.get(2)).isNotNull();
        Assertions.assertThat(courses.get(2).getId()).isEqualTo(5);
    }

//  ========================GetAllCourses========================
    @Test
    public void givenNothing_whenGetAllCourses_thenReturnCourses() {
        //given

        //when
        List<course> courses = testCourseRepository.getAllCourses();

        //then
        Assertions.assertThat(courses.get(0)).isNotNull();
        Assertions.assertThat(courses.get(0).getId()).isEqualTo(1);

        Assertions.assertThat(courses.get(1)).isNotNull();
        Assertions.assertThat(courses.get(1).getId()).isEqualTo(2);

        Assertions.assertThat(courses.get(2)).isNotNull();
        Assertions.assertThat(courses.get(2).getId()).isEqualTo(3);

        Assertions.assertThat(courses.get(3)).isNotNull();
        Assertions.assertThat(courses.get(3).getId()).isEqualTo(4);

        Assertions.assertThat(courses.get(4)).isNotNull();
        Assertions.assertThat(courses.get(4).getId()).isEqualTo(5);

        Assertions.assertThat(courses.get(5)).isNotNull();
        Assertions.assertThat(courses.get(5).getId()).isEqualTo(6);

        Assertions.assertThat(courses.get(6)).isNotNull();
        Assertions.assertThat(courses.get(6).getId()).isEqualTo(7);

        Assertions.assertThat(courses.get(7)).isNotNull();
        Assertions.assertThat(courses.get(7).getId()).isEqualTo(8);

    }

    //======================================================
    //========================Update========================
    //=======================================================

//  ========================GetAllCourses========================
    @Test
    public void givenCourse_whenUpdateCourse_thenReturnUpdatedCourse() {
        //given
        int courseId = 3;
        course course = new course("Works of Shakespeare", "Critical readings of Macbeth and Romeo and Juliet");

        //when
        testCourseRepository.updateCourse(course, courseId);

        //then
        course returnedCourse = testCourseRepository.getCourseById(courseId);
        Assertions.assertThat(returnedCourse).isNotNull();
        Assertions.assertThat(returnedCourse.getDescription()).isEqualTo("Critical readings of Macbeth and Romeo and Juliet");
    }

    //======================================================
    //========================Delete========================
    //=======================================================

//  ========================GetAllCourses========================
    @Test
    public void givenCourseId_whenDeleteCourse_thenReturnNothing() {
        //given
        int courseId = 5;

        //when
        testCourseRepository.deleteCourse(5);

        //then
        Assertions.assertThat(testCourseRepository.getCourseById(courseId)).isNull();
    }

}
