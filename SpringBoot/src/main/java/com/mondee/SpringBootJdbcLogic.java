package com.mondee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJdbcLogic {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ca=SpringApplication.run(SpringBootJdbcLogic.class, args);
		
EmployeDao ed=ca.getBean(EmployeDao.class, args);
 Employe ee=new Employe();
 ee.setEid(101);
ee.setEname("swathi");
ee.setEsalary(24000);
ed.insert(ee);
	}	
}