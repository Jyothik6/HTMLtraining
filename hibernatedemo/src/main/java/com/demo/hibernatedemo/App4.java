package com.demo.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.demo.hibernatedemo.config.HibernateUtility;

public class App4 {
	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtility.getSessionFactoryObject();
		 Session session=sessionFactory.openSession();
		// Query query= session.createNativeQuery("select prdid,prdname from product where prdcategory=?");
		 Query query= session.createNativeQuery("select * from product");
	 //query.setParameter(1, "Toy");
		 List<Object[]> products=query.getResultList();
		 for(Object[] p:products) {
			 for(Object o:p)
			 System.out.println(o);
		 }
		 session.close();
	
	
	}
	}
