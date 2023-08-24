package com.day4.putndelete.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4.putndelete.model.Student;

public interface StudentRepository extends 
JpaRepository<Student, Integer> {

}
