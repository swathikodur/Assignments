package com.mondee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringLogic {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ca=SpringApplication.run(SpringLogic.class, args);
		
		Student s=ca.getBean(Student.class);
		s.setSid(201);
		s.setSname("swathi");
		s.setSmarks(879);
		 
		System.out.println(s.getSid()+"  "+s.getSname()+" "+s.getSmarks());
	}

}