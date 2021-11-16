package com.nsp.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsp.project.entity.Student;
import com.nsp.project.repository.StudentRepository;


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
	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		repo.save(s);
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		List<Student> list = repo.findAll();
		for (Student s: list) {
			if(s.getStudentId() == id){
				return s;
			}
		}
		return null;
	}



	@Override
	public void updateStudentDetail(Student s) {
		// TODO Auto-generated method stub
	      repo.save(s);
	}



	@Override
	public void deleteStudent(Student s) {
		// TODO Auto-generated method stub
		repo.delete(s);
	}



	

	
	

}
