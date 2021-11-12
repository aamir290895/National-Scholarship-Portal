package com.nsp.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsp.project.entity.Student;
import com.nsp.project.repository.StudentRepositoryImpl;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepositoryImpl repo;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

    
	@Override
	public void save(Student s) {
		// TODO Auto-generated method stub
		repo.save(s);
	}
	

}
