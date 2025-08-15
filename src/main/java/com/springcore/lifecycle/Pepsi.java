package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private Double price;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		System.out.println("Setting Pepsi Price");
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// init
		System.out.println("Opening the bottle : Pepsi Init method");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Throwing the bottle in dustbin : Pepsi destroy method");
	}

}
