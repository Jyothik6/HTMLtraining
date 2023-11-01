package com.demo.hibernatedemo1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.demo.hibernatedemo1.config.HibernateUtility;

public class App2 {
	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtility.getSessionFactoryObject();
		 Session session=sessionFactory.openSession();
		// Query query= session.createNativeQuery("select perid,pername from perfume where percategory=?");
		 Query query= session.createNativeQuery("select * from perfume");
	 //query.setParameter(1, "Toy");
		 List<Object[]> products=query.getResultList();
		 for(Object[] p:products) {
			 for(Object o:p)
			 System.out.println(o);
		 }
		 session.close();
	
	
	}
	}
