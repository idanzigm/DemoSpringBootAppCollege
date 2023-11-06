package com.example.college.controller;

import com.example.college.models.college;
import com.example.college.models.course;
import com.example.college.models.student;
import com.example.college.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class studentController {

    @Autowired
    private studentService studentServ;

    //================================================================================

    @PostMapping("/")
    public void saveStudent(@RequestBody student Student) {
        studentServ.saveStudent(Student);
    }

    @GetMapping("/{id}")
    public student getMyStudentById(@PathVariable int id) {
        return studentServ.getStudentById(id);
    }

    @PutMapping("/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody student Student) {
        if (null != studentServ.getStudentById(id)) {
            Student.setId(id);
            studentServ.saveStudent(Student);
        }
    }

    @DeleteMapping("{id}")
    public void dropOutStudentById(@PathVariable int id) {
        studentServ.dropOutStudentById(id);
    }

    //========================courses=====================================

    @GetMapping("courses/{id}")
    public course getCourseById(int id) {
        return studentServ.getCourseById(id);
    }

    //=======================college===================================
    @GetMapping("college/{id}")
    public college getCollegeById(@PathVariable int id) {
        return studentServ.getCollegeById(id);
    }

    //========================functions==================================
    @PostMapping("{studentId}/{courseId}")
    public void takeCourse(@PathVariable int studentId, @PathVariable int courseId) {
        studentServ.takeCourse(studentId, courseId);
    }

    @DeleteMapping("{studentId}/{courseId}")
    public void dropCourse(@PathVariable int studentId, @PathVariable int courseId) {
        studentServ.dropCourse(studentId, courseId);
    }


}
