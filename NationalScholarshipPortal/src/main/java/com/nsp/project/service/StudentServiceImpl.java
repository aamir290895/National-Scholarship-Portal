package com.nsp.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsp.project.entities.Student;
import com.nsp.project.repositories.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository repo;
    
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		student = repo.save(student);
		return student;
	}


	@Override
	public Student selectStudentByStudentId(Long studentId) {
		// TODO Auto-generated method stub
		
		return repo.getById(studentId);
	}

	@Override
	public void updateStudent(Student stu) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void deleteStudent(Long student) {
		// TODO Auto-generated method stub
		repo.deleteById(student);
	}

	@Override
	public Student findByempw(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
