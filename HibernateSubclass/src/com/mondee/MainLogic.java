package com.mondee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
public class MainLogic {
public static void main(String[] args) {
       StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
       Metadata me=new org.hibernate.boot.MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = me.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		CreditCard cc=new CreditCard();
		cc.setPaymentId(380);
		cc.setAmount(1000);
		cc.setCreditCardType("VISA");
		
		Cheque cq=new Cheque();
		cq.setPaymentId(868);
		cq.setAmount(70000);
		cq.setChequeType("ICICI");
		 se.save(cc);
		 se.save(cq);
		tx.commit();
		se.close();
		}
}