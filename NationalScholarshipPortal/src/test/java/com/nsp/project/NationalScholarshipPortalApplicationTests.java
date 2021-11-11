package com.nsp.project;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nsp.project.entity.Student;
import com.nsp.project.repository.StudentRepository;

@SpringBootTest
class NationalScholarshipPortalApplicationTests {
  @Autowired
  StudentRepository repo;
  
 
  
	@Test
	void contextLoads() {
	}
	
	
	
	@Test
	void insertDetails() {
		
		LocalDate ld = LocalDate.of(2021,10,11);
		
		Student s = new Student();
		s.setStudentId((long) 12345);
		s.setAdharNumber("462773832833");
		s.setBankAccountNumber("20380162843");
		s.setStudentName("Aamir Khan");
		s.setBankIfsc("SBIN0000481");
		s.setGender("Male");
		s.setDistrict("Shahdol");
		s.setEmail("aamir.007sdl.ak@gmail.com");
		s.setBankName("SBI");
		s.setDateOfBirth(ld);
		s.setInstituteCode(1);
	
		repo.save(s);
		
	}
}
