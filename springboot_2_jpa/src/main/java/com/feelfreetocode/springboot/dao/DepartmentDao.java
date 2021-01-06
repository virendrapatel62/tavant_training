package com.feelfreetocode.springboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feelfreetocode.springboot.models.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, String> {
	
}