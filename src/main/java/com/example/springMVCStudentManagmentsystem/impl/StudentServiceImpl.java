package com.example.springMVCStudentManagmentsystem.impl;

import com.example.springMVCStudentManagmentsystem.entity.Student;
import com.example.springMVCStudentManagmentsystem.repository.StudentRepository;
import com.example.springMVCStudentManagmentsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllstudent() {

        return studentRepository.findAll();
    }
}
