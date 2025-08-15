package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {

	private String empName;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> courses;
	private Properties courseStatus;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Properties getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(Properties courseStatus) {
		this.courseStatus = courseStatus;
	}

	public Emp(String empName, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		this.empName = empName;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
		this.courseStatus = courseStatus;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * @Override public String toString() { return "Emp [empName=" + empName +
	 * ", phones=" + phones + ", address=" + address + ", courses=" + courses + "]";
	 * }
	 */
}
