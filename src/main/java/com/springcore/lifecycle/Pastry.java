package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pastry {
	private String flavour;

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		System.out.println("Setting the flavour");
		this.flavour = flavour;
	}

	public Pastry() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pastry [flavour=" + flavour + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Eating : Pastry Init Method");
	}

	@PreDestroy
	public void end() {
		System.out.println("Finished: Pastry Destroy Method");
	}
}
