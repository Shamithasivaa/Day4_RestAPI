package com.day4.putndelete.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.putndelete.model.Student;
import com.day4.putndelete.repository.StudentRepository;
@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	public Student addStudentDetails(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	public List<Student> showStudentDetails() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	public Student updateStudentDetails(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.saveAndFlush(student);
	}

	public void deleteStudentDetails(Student student) {
		// TODO Auto-generated method stub
		studentRepository.delete(student);
	}

	public Student updateStudentDetailsByid(int id, Student student) {
		// TODO Auto-generated method stub
		
		return studentRepository.saveAndFlush(student);
	
	}

		 
}
