package com.example.springMVCStudentManagmentsystem.controller;

import com.example.springMVCStudentManagmentsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
   private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //handle method to handle list student and return mode and view

    @GetMapping("/student")
    public String listStudnet(Model model){
        model.addAttribute("students",studentService.getAllstudent());
        return "students";
    }
}
