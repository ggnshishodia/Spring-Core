package com.springcore.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.noxml")

public class JavaCon {

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}

	@Bean(name = { "student", "temp", "con" })
	public Student getstudent() { //
		// creating a new student object

		/*
		 * Student student = new Student(); return student;
		 */

		return new Student(getSamosa());
	}

}
