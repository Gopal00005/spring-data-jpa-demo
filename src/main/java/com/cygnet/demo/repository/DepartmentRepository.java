package com.cygnet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cygnet.demo.entity.Department;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByName(String name);
}