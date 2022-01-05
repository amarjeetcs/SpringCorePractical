package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddres;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentAddres) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddres = studentAddres;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddres=" + studentAddres
				+ "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("Setting Student Id");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting Student Name");
		this.studentName = studentName;
	}
	public String getStudentAddres() {
		return studentAddres;
	}
	public void setStudentAddres(String studentAddres) {
		System.out.println("Setting Student Address");
		this.studentAddres = studentAddres;
	}
	
}
