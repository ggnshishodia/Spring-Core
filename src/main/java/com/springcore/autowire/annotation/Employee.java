package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}

	// @Autowired (Used above setter for setter injection)
	public void setAddress(Address address) {
		System.out.println("Setting value");
		this.address = address;
	}

	// @Autowired // Used above constructor for constructor injection
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor Method");
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
