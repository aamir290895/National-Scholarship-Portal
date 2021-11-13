package com.nsp.project.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
@Repository
public class BaseRepository {
	
	@PersistenceContext
    public EntityManager entityManager;
	
	
	public EntityManager getEntityManager() {
		System.out.println("BaseRepository: getting entityManager");
		return entityManager;
	}

}
