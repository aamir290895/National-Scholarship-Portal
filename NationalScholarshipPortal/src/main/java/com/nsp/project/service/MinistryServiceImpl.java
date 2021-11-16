package com.nsp.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsp.project.entity.Ministry;
import com.nsp.project.repository.MinistryRepository;

@Service
public class MinistryServiceImpl implements MinistryService {
	
	
	@Autowired
	MinistryRepository repo;

	
	

	@Override
	public void insertMinistry(Ministry min) {
		// TODO Auto-generated method stub
		repo.save(min);
	}

	@Override
	public void updateMinistry(Ministry min) {
		// TODO Auto-generated method stub
		repo.save(min);
	}

	@Override
	public void deleteMinistry(int min) {
		// TODO Auto-generated method stub
		repo.deleteById(null);;
	}

	@Override
	public Ministry findMinistryByempw(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ministry findMinistryEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Optional<Ministry> findById(int id) {
		// TODO Auto-generated method stub
		String sId = Integer.toString(id);
		return repo.findById(sId);
	}

	@Override
	public List<Ministry> ministryState(String stateName) {
		// TODO Auto-generated method stub
		return null;
	}

}
