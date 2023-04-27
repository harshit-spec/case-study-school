package com.student.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.school.entity.Student;
import com.student.school.service.StudentService;

import jakarta.ws.rs.PUT;

@RestController
@RequestMapping("/student")
public class StudentController {

	
	@Autowired
	private StudentService service;
	
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
	@PutMapping("/update/{id}")
	public Student updateStudent(@RequestBody Student student,@PathVariable String id) {
		return service.updateStu(student,id);
	}
	@GetMapping("/list")
	public List<Student> studentList(){
		return service.list();
	}
	@GetMapping("/list/{branch}")
	public List<Student> getByBranch(@PathVariable String branch) {
		return service.getBranch(branch);
	}
	}
