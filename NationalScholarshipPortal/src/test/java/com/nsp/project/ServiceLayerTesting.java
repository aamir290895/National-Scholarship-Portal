package com.nsp.project;

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
		
		Student s = repo.getById(4);
		service.deleteStudent(s);
	}

}
