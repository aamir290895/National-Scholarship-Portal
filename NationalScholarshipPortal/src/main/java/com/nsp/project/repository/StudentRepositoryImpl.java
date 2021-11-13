package com.nsp.project.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.nsp.project.entity.Student;
@Repository
public class StudentRepositoryImpl extends BaseRepository implements StudentRepository {

	
  
    @Transactional
	@Override
	public Student saveStudent(Student sObj) {
		// TODO Auto-generated method stub
    	EntityManager entityManager = getEntityManager();
    	entityManager.persist(sObj);
		return  sObj;
	}
    @Transactional
	@Override
	public void save(Student sObj) {
		EntityManager entityManager = getEntityManager();
    	entityManager.persist(sObj);
    	
		// TODO Auto-generated method stub
		
	}
    @Transactional
	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
    	
    	TypedQuery query = getEntityManager().createQuery("student",Student.class);
		return query.getResultList();
	}






	
}
