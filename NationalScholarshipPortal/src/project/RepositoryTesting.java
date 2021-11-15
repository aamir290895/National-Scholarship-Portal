package com.nsp.project;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nsp.project.entities.InstituteApplication;
import com.nsp.project.entities.Student;
import com.nsp.project.repositories.InstituteApplicationRepository;
import com.nsp.project.repositories.StudentRepository;

@SpringBootTest
public class RepositoryTesting {
	
	@Autowired
	StudentRepository studentRepository;
	
	
	@Autowired
	InstituteApplicationRepository instituteRepository;
	
	@Test
	void saveStudent() {
		
		Student s = new Student();
		LocalDate ld = LocalDate.of(2021, 10, 11);

		s.setAdharNumber("462773832833");
		s.setBankAccountNumber("20380162843");
		s.setStudentName("Aamir");
		s.setBankIfsc("SBIN0000481");
		s.setGender("Male");
		s.setDistrict("Shahdol");
		s.setEmail("avinash@gmail.com");
		s.setBankName("SBI");
		s.setDateOfBirth(ld);
		s.setInstituteCode(1);

        studentRepository.save(s);
	}
	
	
	@Test
	void saveInstitute() {
		
		InstituteApplication instApp = new InstituteApplication();
		
		LocalDate ld = LocalDate.of(2021, 10, 11);

		instApp.setInstitudeCode(32);
		instApp.setApplyDate(ld);
		
		instituteRepository.save(instApp);
	}

	@Test
	void listStudents() {
		List<Student> list = studentRepository.findAll();
	    for(Student stu: list)
			{
				System.out.println(stu.getStudentId());
				System.out.println(stu.getStudentName());
				System.out.println(stu.getBankIfsc());
				System.out.println(stu.getBankName());
				System.out.println(stu.getAdharNumber());
				System.out.println(stu.getEmail());
				System.out.println(stu.getState());
				System.out.println(stu.getGender());

				
			}
		

	}
	
	
	@Test
	void deleteStudent() {
		
		Student s = studentRepository.findById((long)4).get();
		
		
		studentRepository.delete(s);
		
	}
}
