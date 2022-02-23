package com.mondee;


	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;
	public class MainLogic {

		public static void main(String[] args) {

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("jbd-pu");
			EntityManager em = emf.createEntityManager();
			Student s = em.find(Student.class,1);
	      
	
			System.out.println(s.getSid() +" "+s.getSmarks()+" "+s.getSname());
		}

	}