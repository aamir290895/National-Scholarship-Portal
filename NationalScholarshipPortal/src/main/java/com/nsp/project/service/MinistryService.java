package com.nsp.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nsp.project.entity.Ministry;
import com.nsp.project.entity.Student;


@Service
public interface MinistryService {

	  public List<Ministry> getAllMinistryDetails();
	  
	  public void saveMinistry (Ministry min);
	  public Ministry getMinistryDetails(int id);
	  public void updateMinistryDetails(Ministry min);
	  public void deleteMinistry(Ministry min);
    
    
}
