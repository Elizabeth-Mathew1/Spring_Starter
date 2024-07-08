package com.RestApi.Trial.Controller;

import com.RestApi.Trial.Models.Student;
import com.RestApi.Trial.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("/")
    public List<Student> getAllStudents()
    {
        return studentRepo.findAll();
    }

    @PostMapping("/student")
    public void createStudent(@RequestBody Student student)
    {
        studentRepo.save(student);
    }
}
