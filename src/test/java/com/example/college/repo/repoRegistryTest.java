package com.example.college.repo;

import com.example.college.CollegeApplication;
import com.example.college.models.course;
import com.example.college.models.student;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.assertj.core.api.Assertions;

import java.util.List;

import static org.springframework.test.annotation.DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD;

@DataJpaTest
@SpringJUnitConfig(classes = CollegeApplication.class)
@Transactional
@DirtiesContext(classMode = BEFORE_EACH_TEST_METHOD)
public class repoRegistryTest {

    @Autowired
    private repoRegistry testRegistryRepository;

    @Autowired
    private repoStudent testStudentRepository;

    @Autowired
    private repoCourse testCourseRepository;

    //==========================================================

    @Test
    public void givenNothing_whenReturnRegistryByCourse_thenReturnRegistryByCourse() {
        //given

        //when
        List<course> courses = testRegistryRepository.returnRegistryByCourse();

        //then
        for (com.example.college.models.course course : courses) {
            System.out.println(course.getName());
            for (com.example.college.models.student student : course.getStudents()) {
                System.out.println(student.toString());
            }
        }

    }

    @Test
    public void givenNothing_whenReturnRegistryByStudent_thenReturnRegistryByStudent() {
        //given

        //when
        List<student> students = testRegistryRepository.returnRegistryByStudent();

        //then
        for (com.example.college.models.student student : students) {
            System.out.println(student.getFirstName());
            for (com.example.college.models.course course : student.getCourses()) {
                System.out.println(course.toString());
            }
        }

    }

    @Test
    public void givenStudentIdAndCourseId_whenTakeCourse_thenReturnRegistryEntry() {
        //given
        int StudentId = 4;
        int CourseId = 3;

        int x = 0;

        //when
        testRegistryRepository.takeCourse(StudentId, CourseId);

        //then
        for (course course : testStudentRepository.getStudentById(StudentId).getCourses()) {
            if (course.getId() == CourseId) {
                x++;
            }
        }
        for (student student : testCourseRepository.getCourseById(CourseId).getStudents()) {
            if (student.getId() == StudentId) {
                x++;
            }
        }

        //then
        Assertions.assertThat(x).isEqualTo(2);
    }

    @Test
    public void givenStudentIdAndCourseId_whenDropCourse_thenReturnNothing() {
        //given
        int StudentId = 7;
        int CourseId = 8;

        int x = 0;

        //when
        testRegistryRepository.dropCourse(StudentId, CourseId);

        //then
        for (course course : testStudentRepository.getStudentById(StudentId).getCourses()) {
            if (course.getId() == CourseId) {
                x++;
            }
        }
        for (student student : testCourseRepository.getCourseById(CourseId).getStudents()) {
            if (student.getId() == StudentId) {
                x++;
            }
        }

        //then
        Assertions.assertThat(x).isEqualTo(0);
    }

}
