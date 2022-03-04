package com.springcore;

public class Student {
	
	private int studentId;
	private String stuentName;
	private String studentAdress;
	
	public Student(int studentId, String stuentName, String studentAdress) {
		super();
		this.studentId = studentId;
		this.stuentName = stuentName;
		this.studentAdress = studentAdress;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStuentName() {
		return stuentName;
	}

	public void setStuentName(String stuentName) {
		this.stuentName = stuentName;
	}

	public String getStudentAdress() {
		return studentAdress;
	}

	public void setStudentAdress(String studentAdress) {
		this.studentAdress = studentAdress;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", stuentName=" + stuentName + ", studentAdress=" + studentAdress
				+ "]";
	}
	
	
	
	

}
