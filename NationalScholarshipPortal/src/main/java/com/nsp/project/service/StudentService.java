package com.nsp.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nsp.project.entity.Student;
@Service
public interface StudentService {
  List<Student> getAllStudents();
  
  public void saveStudent (Student s);
  public Student getStudent(int id);
  public void updateStudentDetail(Student s);
  public void deleteStudent(Student s);
  
}
