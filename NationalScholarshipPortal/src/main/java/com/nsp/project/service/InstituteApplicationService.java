package com.nsp.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nsp.project.entity.InstituteApplication;

@Service
public interface InstituteApplicationService {
	
	  public List<InstituteApplication> getAllMinistryDetails();
	  
	  public void saveInstitute (InstituteApplication instApp);
	  public InstituteApplication getApplicationDetails(int id);
	  public void updateMinistryDetails(int id ,InstituteApplication instApp);
	  public void deleteMinistry(InstituteApplication instApp);
   

}
