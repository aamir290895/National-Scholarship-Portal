package com.nsp.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsp.project.entity.Ministry;
import com.nsp.project.entity.Student;
import com.nsp.project.repository.MinistryRepository;

@Service
public class MinistryServiceImpl implements MinistryService {
	
	
	@Autowired
	MinistryRepository repo;

	@Override
	public List<Ministry> getAllMinistryDetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void saveMinistry(Ministry min) {
		// TODO Auto-generated method stub
		repo.save(min);
	}

	@Override
	public Ministry getMinistryDetails(int id) {
		
		List<Ministry> list = repo.findAll();
		for (Ministry ministry: list) {
			if(ministry.getMinistryId() == id){
				return ministry;
			}
		}
		return null;
		// TODO Auto-generated method stub
	}


	@Override
	public void deleteMinistry(Ministry min) {
			repo.delete(min);	
	}

	@Override
	public void updateMinistryDetails(int id, Ministry ministry) {
		
		List<Ministry> list = repo.findAll();
		for (Ministry min: list) {
			if(min.getMinistryId() == id){
				 repo.save(ministry);
			}
		}
		
		// TODO Auto-generated method stub
		
	}

	

	
	


}
