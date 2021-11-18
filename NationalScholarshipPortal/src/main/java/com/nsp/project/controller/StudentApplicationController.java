package com.nsp.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nsp.project.entity.StudentApplication;
import com.nsp.project.service.StudentApplicationServiceImpl;

@RestController
@RequestMapping("/StudentApplication")
public class StudentApplicationController {
	
	@Autowired
	StudentApplicationServiceImpl service;
	
	@GetMapping("/list")
	public List<StudentApplication> getAllStudents(){
		return service.getAllApplication();
	}

}
