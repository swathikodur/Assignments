package com.mondee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration; 

public class Mainlogic {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cf = new Configuration();
		cf.configure("hibernate.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		Student s = new Student();
		s.setSid(1234);
		s.setSname("swathi");
		s.setSmarks(50);
		
		se.save(s);
		tx.commit();
		se.close();
		}	
	}