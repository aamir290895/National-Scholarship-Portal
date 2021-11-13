package com.nsp.project.repository;

import org.springframework.stereotype.Repository;

import com.nsp.project.entity.Student;

@Repository
public interface StudentRepository {
  public Student saveStudent(Student sObj);
  
  void save(Student sObj);
	
	
}
