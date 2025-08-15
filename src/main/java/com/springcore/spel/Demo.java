package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{22+11}")
	private int x;

	@Value("#{1+2+3+4}")
	private int y;

	// calling static method
	@Value("#{ T(java.lang.Math).sqrt(64) }")
	private double z;

	// calling variable
	@Value("#{T(java.lang.Math).PI}")
	private double e;

	// create object
	@Value("#{new java.lang.String('Akshita Thakur')}")
	private String st;

	// Inserting boolean
	@Value("#{ 8>3 }")
	private boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", st=" + st + ", isActive=" + isActive + "]";
	}

}
