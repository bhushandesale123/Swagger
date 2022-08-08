package com.Aparna.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Aparna.model.Student;

@RestController
public class StudentController {
	@PostMapping(value = "/add", consumes = "application/json",produces="application/json")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
	if (student != null) {
		return new ResponseEntity<Student>(student, HttpStatus.CREATED);
	}else {
	return new ResponseEntity<Student>(student, HttpStatus.BAD_REQUEST);

}
		
		
		
	}
}
