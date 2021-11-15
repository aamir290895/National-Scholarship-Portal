package com.nsp.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nsp.project.entities.Ministry;

@Repository
public interface MinistryRepository extends JpaRepository<Ministry, String> {

}
