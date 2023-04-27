package com.student.school.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.student.school.entity.Student;
import com.student.school.repository.StudentRepo;
@Service
public class StudentService {
@Autowired
private StudentRepo repo;
	
public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

	public Student updateStu(Student student, String id) {
		Optional<Student> stud  = repo.findById(id);
		
		Student studen = stud.get();
		studen.setName(student.getName());
		studen.setBranch(student.getBranch());
		return repo.save(studen);
	}

	public List<Student> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public List<Student> getBranch(String branch) {
		List<Student> students = repo.findAll();
		return students.stream()
		.filter(c -> c.getBranch().equals(branch))
		.collect(Collectors.toList());
	}

}