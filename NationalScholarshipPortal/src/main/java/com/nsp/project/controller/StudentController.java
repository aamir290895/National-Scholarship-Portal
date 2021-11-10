package com.nsp.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nsp.project.entity.Student;
import com.nsp.project.repository.StudentRepository;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	  @Autowired
      private StudentRepository studentRepository;
	  
	  @GetMapping("/list")
	  public List<Student> getAllStudents(){
		return studentRepository.findAll();
		  
	  }
	  
	
}
