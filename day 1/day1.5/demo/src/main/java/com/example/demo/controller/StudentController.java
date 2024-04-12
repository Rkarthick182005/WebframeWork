package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

import java.util.ArrayList;
import java.util.List;
@RestController
public class StudentController {
    @GetMapping("/student")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        Student obj = new Student();
        obj.setStudentName("karthi");
        obj.setMessage("Welcome, karthi!");
        students.add(obj);
        return students;
    }
}
