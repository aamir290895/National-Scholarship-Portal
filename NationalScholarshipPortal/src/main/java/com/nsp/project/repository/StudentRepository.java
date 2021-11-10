package com.nsp.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nsp.project.entity.Student;


public interface StudentRepository extends JpaRepository<Student,Long>{

}
