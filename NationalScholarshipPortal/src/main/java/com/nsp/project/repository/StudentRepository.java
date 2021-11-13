package com.nsp.project.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nsp.project.entity.Student;
import com.nsp.project.exceptions.StudentNotFoundException;

@Repository
public interface StudentRepository {
  public Student saveStudent(Student sObj);
  public List<Student> selectAllStudents() throws StudentNotFoundException;
  
  void save(Student sObj);
	
	
}
