package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Student {

	@Value("Akshita")
	private String studentName;
	@Value("Kushawali")
	private String city;

	@Value("#{stsm}")
	private List<String> socialmedia;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getSocialmedia() {
		return socialmedia;
	}

	public void setSocialmedia(List<String> socialmedia) {
		this.socialmedia = socialmedia;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", socialmedia=" + socialmedia + "]";
	}

}
