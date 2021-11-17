package com.nsp.project;

import java.time.LocalDate;
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
		LocalDate ld = LocalDate.of(2021, 10, 11);

		s.setAdharNumber("462773832833");
		s.setBankAccountNumber("20380162843");
		s.setStudentName("iiiii");
		s.setBankIfsc("SBIN0000481");
		s.setGender("Male");
		s.setDistrict("Shahdol");
		s.setEmail("avinash@gmail.com");
		s.setBankName("SBI");
		s.setDateOfBirth(ld);
		s.setInstituteCode(1);
		service.updateStudentDetail(3, s);
	}
	
	void getStudent() {
		
	   Optional<Student> st= service.getStudent(3);
	   
	}
}
