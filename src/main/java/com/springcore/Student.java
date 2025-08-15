package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Setting Name");
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		System.out.println("Setting Name");
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting Address");
		this.studentAddress = studentAddress;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("Setting Id");
		this.studentId = studentId;
	}

	/*
	 * public Student(int studentId, String studentName, String studentAddress) {
	 * super(); this.studentId = studentId; this.studentName = studentName;
	 * this.studentAddress = studentAddress; }
	 * 
	 * public Student() { super(); // TODO Auto-generated constructor stub }
	 */

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

}
