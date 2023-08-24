package com.day4.putndelete.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.day4.putndelete.model.Student;
import com.day4.putndelete.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	StudentService studentService;
	@PostMapping()
	public Student addStudentDetails(@RequestBody Student student)
	{
		return studentService.addStudentDetails(student);
	}
	
	@GetMapping("showdetails")
	public List<Student> show()
	{
		return studentService.showStudentDetails();
	}
	
	@PutMapping("update")
	public Student updateStudentDetails(@RequestBody Student student)
	{
		return studentService.updateStudentDetails(student);
	}
	
	@DeleteMapping("delete")
	public String deleteStudentDetails(@RequestBody Student student)
	{
		studentService.deleteStudentDetails(student);
		return "deleted successfully";
	}

}
