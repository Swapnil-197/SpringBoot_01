package com.sb.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.pojo.Student;

@RestController
//@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents(){
		List<Student> listOfStudents = new ArrayList<>();
		Student student = new Student();
		student.setSid(1);
		student.setName("Swapnil");
		student.setCourse("Java");
		listOfStudents.add(student);
		Student student1 = new Student();
		student1.setSid(2);
		student1.setName("Nayan");
		student1.setCourse("Python");
		listOfStudents.add(student1);
		Student student3 = new Student();
		student3.setSid(3);
		student3.setName("Pavan");
		student3.setCourse("Ruby");
		listOfStudents.add(student3);
		return listOfStudents;
	}
	
	@GetMapping("/nameOfStudents")
	public List<String> nameOfStudents(){
		return Arrays.asList("Swapnil","Nayan","Trupti","Shubham");
		
	}

}
