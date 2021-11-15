package com.nsp.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.nsp.project.service.InstituteApplicationServiceImpl;

@RestController
public class InstituteApplicationController {
	
	@Autowired
	InstituteApplicationServiceImpl service;

}
