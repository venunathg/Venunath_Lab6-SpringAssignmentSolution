package com.greatLearning.studentRegistration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.studentRegistration.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByNameContainsAndDepartmentContainsAllIgnoreCase(String name, String department);
	

}
