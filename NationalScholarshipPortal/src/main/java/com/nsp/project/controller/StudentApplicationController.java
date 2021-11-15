package com.nsp.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nsp.project.service.StudentApplicationServiceImpl;

@RestController
@RequestMapping("nsp/Student Application Form")
public class StudentApplicationController {
	
	
	@Autowired
	StudentApplicationServiceImpl service;
	

}
