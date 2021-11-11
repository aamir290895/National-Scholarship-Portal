package com.nsp.project;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.nsp.project.entity.Student;
import com.nsp.project.repository.StudentRepository;

@SpringBootTest
public class StudentTest {
 
	
	@Autowired
	StudentRepository stRepo;
	
	 @PersistenceContext
	  EntityManager entityManager;
	 
	
	 
	
	 
	 
	@Test
	void insertDetails() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 
		
		System.out.println("Entity Manager Factory : "+entityManagerFactory);
		
		entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M
		
		System.out.println("Entity Manager : "+entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		
	
		LocalDate ld = LocalDate.of(2021,10,11);

		
	    Student s = new Student();
	    s.setStudentId((long) 0000);
		s.setAdharNumber("462773832833");
		s.setBankAccountNumber("20380162843");
		s.setStudentName("Aamir Khan");
		s.setBankIfsc("SBIN0000481");
		s.setGender("Male");
		s.setDistrict("Shahdol");
		s.setEmail("aamir.007sdl.ak@gmail.com");
		s.setBankName("SBI");
		s.setDateOfBirth(ld);
		s.setInstituteCode(3);
		entityManager.persist(s);
		transaction.commit();
	}

}
