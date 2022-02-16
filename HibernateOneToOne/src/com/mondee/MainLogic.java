package com.mondee;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class MainLogic {

	public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
	       Metadata me=new org.hibernate.boot.MetadataSources(ssr).getMetadataBuilder().build();
			SessionFactory sf = me.buildSessionFactory();
			Session se = sf.openSession();
			Transaction tx = se.beginTransaction();
     
     Vehicle v=new Vehicle();
     v.setVehiclename("audi");
     v.setVehicleid(101);
     
     UserDetails u=new UserDetails();
     u.setUserid(3);
     u.setUsername("tom");
   
     u.setObj(v);
     
     se.save(v);
     se.save(u);
     
     tx.commit();
     se.close();
	}

}
