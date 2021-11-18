package com.nsp.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/get/{id}")
	public Optional<StateNodalOfficer> getNodalOfficer(@PathVariable int id){
		return service.getNodalOfficerId(id);
	}
	
	@GetMapping("/save")
	 public void saveOfficer(@RequestBody StateNodalOfficer officer) {
		 service.saveNodalOfficer(officer);
	 }
	
	@GetMapping("/update")
	public void updateOfficer(@RequestBody int id,StateNodalOfficer officer) {
		
		service.updateNodalOfficer(id, officer);
	}
	
	@GetMapping("/delete")
	public void deleteOfficer(@RequestBody int id) {
		
		service.deleteNodalOfficer(id);
	}
}
