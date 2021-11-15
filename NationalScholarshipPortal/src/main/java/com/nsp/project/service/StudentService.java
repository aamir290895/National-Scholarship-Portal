package com.nsp.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nsp.project.entity.Student;
@Service
public interface StudentService {
  List<Student> getAllStudents();
  
  void save (Student s);
}
