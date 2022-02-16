package com.mondee;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;


//import antlr.collections.List;  

public class MainLogic {

	public static void main(String[] args) {

		
		Session session = HibernateUtil.getSessionFactory().openSession();

	    Transaction t = session.beginTransaction();
	    
	    // 1.Hql select:
	    
	    /*Query qr = session.createQuery("from Student s");
	    List li = qr.list();
	    Iterator<Student> i = li.iterator();
	    while(i.hasNext()) {
	    	Student x = i.next();
	    	System.out.println(x.getSid()+" "+x.getSmarks()+" "+x.getSname());*/
	    
	    
	  //2.retrieving particular columns:
	    
	   /* Query qr = session.createQuery("select s.sid, s.smarks from Student s");
	    List li = qr.list();
	    Iterator i = li.iterator();
	    while(i.hasNext()) {
	    	Object[] x =(Object[]) i.next();
	    	System.out.println(x[0]+" "+x[1]);
	    }*/
	    
	    //3.retrieving particular record:
	    
		   /* Query qr = session.createQuery(" from Student s where s.sid =:student1");
		    qr.setParameter("student1", 1);
		    List li = qr.list();
		    Iterator i = li.iterator();
		    while(i.hasNext()) {
		    	Student x =(Student) i.next();
		    	System.out.println(x.getSid()+" "+x.getSmarks()+" "+x.getSname());
		    }*/
	    
	  //4.delete particular record
	    
	   /* Query qr = session.createQuery(" delete from Student s where s.sid =:student1");
	    qr.setParameter("student1", 1);
	    qr.executeUpdate();       
	    t.commit();  
		session.close();*/
	    
	   Student s1=new Student();    
	    
	      //Insert Query:
	    s1.setSid(1);    
	    s1.setSname("Swathi");    
	    s1.setSmarks(45);
	    
	    
	   
	    session.save(s1);  
	    t.commit();  
		session.close();

	}

	}
