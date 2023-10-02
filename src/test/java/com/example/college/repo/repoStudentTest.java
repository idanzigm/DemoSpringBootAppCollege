package com.example.college.repo;

import com.example.college.CollegeApplication;
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
@SpringJUnitConfig(classes = CollegeApplication.class)
@Transactional
@DirtiesContext(classMode = BEFORE_EACH_TEST_METHOD)
public class repoStudentTest {

    @Autowired
    private repoStudent testStudentRepository;
    @Autowired
    private repoRegistry testRegistryRepository;

    //======================================================
    //========================CREATE========================
    //=======================================================
//    ========================SaveStudent========================
    @Test
    public void givenStudent_whenSaveStudent_thenReturnSavedStudent(){

        //given
        student testStudent1 = new student("John", "Bishop");
        student testStudent2 = new student("Ryan", "Priest");
        student testStudent3 = new student("Susan", "Pope");

        //when
        testStudentRepository.saveStudent(testStudent1);
        testStudentRepository.saveStudent(testStudent2);
        testStudentRepository.saveStudent(testStudent3);

        //then
        Assertions.assertThat(testStudentRepository.getStudentById(10)).isNotNull();
        Assertions.assertThat(testStudentRepository.getStudentById(10).getFirstName()).isEqualTo("John");
        Assertions.assertThat(testStudentRepository.getStudentById(10).getLastName()).isEqualTo("Bishop");

        Assertions.assertThat(testStudentRepository.getStudentById(11)).isNotNull();
        Assertions.assertThat(testStudentRepository.getStudentById(11).getFirstName()).isEqualTo("Ryan");
        Assertions.assertThat(testStudentRepository.getStudentById(11).getLastName()).isEqualTo("Priest");

        Assertions.assertThat(testStudentRepository.getStudentById(12)).isNotNull();
        Assertions.assertThat(testStudentRepository.getStudentById(12).getFirstName()).isEqualTo("Susan");
        Assertions.assertThat(testStudentRepository.getStudentById(12).getLastName()).isEqualTo("Pope");
    }

    //======================================================
    //========================Read========================
    //=======================================================
//    ========================GetStudentById========================

    @Test
    public void givenStudent_whenGetStudentById_thenReturnGivenStudent(){

        //given

        //when

        //then
        Assertions.assertThat(testStudentRepository.getStudentById(1)).isNotNull();
        Assertions.assertThat(testStudentRepository.getStudentById(1).getFirstName()).isEqualTo("John");
        Assertions.assertThat(testStudentRepository.getStudentById(1).getLastName()).isEqualTo("Doe");

        Assertions.assertThat(testStudentRepository.getStudentById(2)).isNotNull();
        Assertions.assertThat(testStudentRepository.getStudentById(2).getFirstName()).isEqualTo("Alice");
        Assertions.assertThat(testStudentRepository.getStudentById(2).getLastName()).isEqualTo("Smith");

        Assertions.assertThat(testStudentRepository.getStudentById(3)).isNotNull();
        Assertions.assertThat(testStudentRepository.getStudentById(3).getFirstName()).isEqualTo("Bob");
        Assertions.assertThat(testStudentRepository.getStudentById(3).getLastName()).isEqualTo("Johnson");
    }

    //    ========================GetMyStudents========================
    @Test
    public void givenCourseId_whenGetMyStudents_thenReturnListOfStudentsInCourse() {
        //given
        int courseId = 5;

        //when
        List<student> myStudents = testStudentRepository.getMyStudents(courseId);

        //then
        Assertions.assertThat(myStudents.get(0)).isNotNull();
        Assertions.assertThat(myStudents.get(0).getFirstName()).isEqualTo("Alice");
        Assertions.assertThat(myStudents.get(0).getLastName()).isEqualTo("Smith");

        Assertions.assertThat(myStudents.get(1)).isNotNull();
        Assertions.assertThat(myStudents.get(1).getFirstName()).isEqualTo("Jason");
        Assertions.assertThat(myStudents.get(1).getLastName()).isEqualTo("Mraz");
    }

    //    ========================GetMyStudentByName========================
    @Test
    public void givenCourseIdAndStudentName_whenGetMyStudentByName_thenReturnListOfStudentsInCourseWithStudentName() {
        //given
        int courseId = 5;
        String studentName = "Alice";

        //when
        List<student> myStudents = testStudentRepository.getMyStudentByName(courseId, studentName);

        //then
        Assertions.assertThat(myStudents.get(0)).isNotNull();
        Assertions.assertThat(myStudents.get(0).getFirstName()).isEqualTo("Alice");
        Assertions.assertThat(myStudents.get(0).getLastName()).isEqualTo("Smith");
    }

    //    ========================GetAllStudents========================
    @Test
    public void givenNothing_whenGetAllStudents_thenReturnListOfAllStudents() {
        //given

        //when
        List<student> myStudents = testStudentRepository.getAllStudents();

        //then
        Assertions.assertThat(myStudents.get(0)).isNotNull();
        Assertions.assertThat(myStudents.get(0).getFirstName()).isEqualTo("John");
        Assertions.assertThat(myStudents.get(0).getLastName()).isEqualTo("Doe");

        Assertions.assertThat(myStudents.get(1)).isNotNull();
        Assertions.assertThat(myStudents.get(1).getFirstName()).isEqualTo("Alice");
        Assertions.assertThat(myStudents.get(1).getLastName()).isEqualTo("Smith");

        Assertions.assertThat(myStudents.get(2)).isNotNull();
        Assertions.assertThat(myStudents.get(2).getFirstName()).isEqualTo("Bob");
        Assertions.assertThat(myStudents.get(2).getLastName()).isEqualTo("Johnson");

        Assertions.assertThat(myStudents.get(3)).isNotNull();
        Assertions.assertThat(myStudents.get(3).getFirstName()).isEqualTo("Jason");
        Assertions.assertThat(myStudents.get(3).getLastName()).isEqualTo("Mraz");

        Assertions.assertThat(myStudents.get(4)).isNotNull();
        Assertions.assertThat(myStudents.get(4).getFirstName()).isEqualTo("Hilary");
        Assertions.assertThat(myStudents.get(4).getLastName()).isEqualTo("Duff");

        Assertions.assertThat(myStudents.get(5)).isNotNull();
        Assertions.assertThat(myStudents.get(5).getFirstName()).isEqualTo("Eliot");
        Assertions.assertThat(myStudents.get(5).getLastName()).isEqualTo("Gray");

        Assertions.assertThat(myStudents.get(6)).isNotNull();
        Assertions.assertThat(myStudents.get(6).getFirstName()).isEqualTo("Hannah");
        Assertions.assertThat(myStudents.get(6).getLastName()).isEqualTo("Montana");

        Assertions.assertThat(myStudents.get(7)).isNotNull();
        Assertions.assertThat(myStudents.get(7).getFirstName()).isEqualTo("Grace");
        Assertions.assertThat(myStudents.get(7).getLastName()).isEqualTo("Flower");

        Assertions.assertThat(myStudents.get(8)).isNotNull();
        Assertions.assertThat(myStudents.get(8).getFirstName()).isEqualTo("George");
        Assertions.assertThat(myStudents.get(8).getLastName()).isEqualTo("Orwell");
    }

    //======================================================
    //========================Update========================
    //=======================================================
//    ========================UpdateStudent========================
    @Test
    public void givenStudent_whenUpdateStudent_thenReturnUpdatedStudent() {
        //given
        student testStudent = new student("Alvin", "Rawls");
        int studentId = 5;

        //when
        testStudentRepository.updateStudent(testStudent, studentId);

        //then
        Assertions.assertThat(testStudentRepository.getStudentById(studentId)).isNotNull();
        Assertions.assertThat(testStudentRepository.getStudentById(studentId).getFirstName()).isEqualTo(testStudent.getFirstName());
        Assertions.assertThat(testStudentRepository.getStudentById(studentId).getLastName()).isEqualTo(testStudent.getLastName());
    }

    //======================================================
    //========================Delete========================
    //=======================================================
//    ========================DropOutStudentById========================

    @Test
    public void givenStudentId_whenDropOutStudentById_thenReturnNothing() {
        //given
        int studentId = 5;

        //when
        student droppedStudent = testStudentRepository.getStudentById(studentId);
        testStudentRepository.dropOutStudentById(studentId);

        //then
        Assertions.assertThat(testStudentRepository.getStudentById(studentId)).isNull();
        for (com.example.college.models.registry registry : testRegistryRepository.returnRegistry()) {
            System.out.println(registry.getStudent().toString());
            Assertions.assertThat(registry.getStudent().getId()).isNotEqualTo(studentId);
        }
    }



}
