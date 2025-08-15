package com.springcore.constinj;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certificates certificates;
	private List<String> companies;

	public Person(String name, int personId, Certificates certificates, List<String> companies) {
		this.name = name;
		this.personId = personId;
		this.certificates = certificates;
		this.companies = companies;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " : " + this.personId + " certified " + this.certificates + " " + this.companies;
	}

}
