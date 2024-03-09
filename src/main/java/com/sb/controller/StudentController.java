package com.sb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.pojo.Student;

@RestController
public class StudentController {
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents(){
		List<Student> listOfStudents = new ArrayList<>();
		Student student = new Student();
		student.setSid(1);
		student.setName("Swapnil");
		student.setCourse("Java");
		listOfStudents.add(student);
		return listOfStudents;
	}

}
