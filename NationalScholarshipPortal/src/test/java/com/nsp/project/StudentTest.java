package com.nsp.project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nsp.project.entity.Student;
import com.nsp.project.repository.StudentRepositoryImpl;

@SpringBootTest
public class StudentTest {
	@Autowired
	StudentRepositoryImpl sImpl;
	
	@Test
	void insertDetails() {
		Student s = new Student();
		s.setStudentId( (long) 12);
		sImpl.insertStudentDetails(s);
		
		
	}

}
