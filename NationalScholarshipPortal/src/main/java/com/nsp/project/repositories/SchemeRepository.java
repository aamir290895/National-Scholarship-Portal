package com.nsp.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nsp.project.entities.Scheme;


@Repository
public interface SchemeRepository extends JpaRepository<Scheme, Long> {

}
