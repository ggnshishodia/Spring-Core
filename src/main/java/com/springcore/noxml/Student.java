package com.springcore.noxml;

//@Component("temp")
public class Student {

	@Override
	public String toString() {
		return "Student [samosa=" + samosa + "]";
	}

	private Samosa samosa;

	public Student(Samosa samosa) {
		super();
		this.setSamosa(samosa);
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void study() {
		this.samosa.display();
		System.out.println("Student is studying");
	}
}
