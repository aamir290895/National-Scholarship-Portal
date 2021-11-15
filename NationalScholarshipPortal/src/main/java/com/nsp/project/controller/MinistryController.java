package com.nsp.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.nsp.project.service.MinistryServiceImpl;

@RestController
public class MinistryController {
	
	
	@Autowired
	MinistryServiceImpl service;

}
