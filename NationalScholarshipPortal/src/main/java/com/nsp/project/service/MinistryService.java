package com.nsp.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nsp.project.entity.Ministry;


@Service
public interface MinistryService {

	List<Ministry> ministryState(String stateName);
	
	Optional<Ministry> findById(int id);
	void insertMinistry(Ministry min);
    void updateMinistry(Ministry min);
    void deleteMinistry(int min);
    Ministry findMinistryByempw(String email,String password);
    Ministry findMinistryEmail(String email);
    
    
}
