package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Teacher {
	@Value("RajKumar")
	private String name;
	@Value("PhD")
	private String qualification;

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", qualification=" + qualification + "]";
	}

}
