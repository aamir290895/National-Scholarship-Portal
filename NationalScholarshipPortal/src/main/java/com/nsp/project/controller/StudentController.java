package com.nsp.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nsp.project.entities.Student;
import com.nsp.project.repositories.StudentRepository;
import com.nsp.project.service.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	  @Autowired
      private  StudentServiceImpl stuService;

	  @GetMapping("/list")//localhost:8080/Student/list/1
	  public List<Student> getAllStudents(){
		return stuService.getAllStudents();
		  
	  }
	  
	
}
