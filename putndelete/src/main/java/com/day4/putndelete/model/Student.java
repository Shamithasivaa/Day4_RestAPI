package com.day4.putndelete.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
    private String studentName;
    private String departmentName;
    private String mailId;
	public Student(int id, String studentName, String departmentName, String mailId) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.departmentName = departmentName;
		this.mailId = mailId;
	}
	
	public Student() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailid(String mailId) {
		this.mailId = mailId;
	}
    

}
