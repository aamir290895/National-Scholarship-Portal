package com.nsp.project;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nsp.project.entity.Student;
import com.nsp.project.repository.StudentRepository;
import com.nsp.project.service.StudentServiceImpl;

@SpringBootTest
public class ServiceLayerTesting {
	
	@Autowired
	StudentServiceImpl service;
	
	@Autowired
	StudentRepository repo;
	
	@Test
	void saveStudent() {
		
		service.deleteStudent(3);
	}

	@Test
	void updateStudent() {
		Student s = new Student();

		s.setDistrict("pune");
		
		service.updateStudentDetail(1, s);
	}
	
	void getStudent() {
		
	   Optional<Student> st= service.getStudent(3);
	   
	}
}
