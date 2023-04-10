package com.example.springMVCStudentManagmentsystem.repository;

import com.example.springMVCStudentManagmentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository <Student,Long>{

}
