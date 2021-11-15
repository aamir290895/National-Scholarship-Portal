package com.nsp.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nsp.project.entities.InstituteApplication;

@Repository
public interface InstituteApplicationRepository extends JpaRepository<InstituteApplication, Integer> {

}
