package com.nsp.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nsp.project.entities.Student;
import com.nsp.project.exceptions.StudentNotFoundException;


@Service
public interface StudentService  {
    List<Student> getAllStudents(); 
    Student save (Student sObj) throws StudentNotFoundException;
	Student selectStudentByStudentId(Long StudentId) throws StudentNotFoundException;
	void updateStudent(Student ref);
	void deleteStudent(Long Student);
    Student findByempw(String email,String password);
    Student findByEmail(String email);
  
  
}
