package com.app.techworm.main.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.techworm.main.model.Student;
import com.app.techworm.main.serviceimplementation.StudentServiceImpl;

@RestController
//we are using postman to do operations for that we need to add cross origin annotation
@CrossOrigin("*")
public class HomeController {
	//To create bean of implementation class
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	//To call save method or save new student
	@PostMapping(value = "saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		System.out.println("Student Save works properly");
		studentServiceImpl.saveStudent(student);
		return student;
	}
	
	@GetMapping(value = "getAllStudents")
	public List<Student> findAllStudent(){
		return studentServiceImpl.findAllStudents();
	}

	@PutMapping(value = "updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		System.out.println("Student Update works properly");
		studentServiceImpl.updateStudent(student);
		return student;
	}
	
	@DeleteMapping(value = "deleteStudent")
	public String deleteStudents(@RequestParam int id) {
		studentServiceImpl.deleteStudent(id);
		return "Student Deleted";
	}
}
