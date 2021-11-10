package com.nsp.project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nsp.project.entity.Student;
import com.nsp.project.repository.StudentRepositoryImpl;

@SpringBootTest
public class StudentTest {
	@PersistenceContext
	EntityManager entityManager;
	
	@Test
	void insertDetails() {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory(null, null);
		
	}

}
