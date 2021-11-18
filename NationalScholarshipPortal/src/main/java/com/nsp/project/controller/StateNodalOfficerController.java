package com.nsp.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nsp.project.entity.Scheme;
import com.nsp.project.entity.StateNodalOfficer;
import com.nsp.project.service.StateNodalOfficerServiceImpl;

@RestController
@RequestMapping("/NodalOfficer")
public class StateNodalOfficerController {
	
	@Autowired
	StateNodalOfficerServiceImpl service;
	
	@GetMapping("/list")
	public List<StateNodalOfficer> getNodalOfficerList(){
		
		return service.getNodalOfficers();
	}
}
