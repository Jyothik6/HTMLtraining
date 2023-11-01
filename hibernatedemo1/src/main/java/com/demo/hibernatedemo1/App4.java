package com.demo.hibernatedemo1;
 
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.hibernatedemo1.entities.Perfume;
import com.demo.hibernatedemo1.config.HibernateUtility;
import com.demo.hibernatedemo1.entities.Perfume;
 
public class App4 {
  public static void main(String[] args) {
	  SessionFactory sessionFactory=HibernateUtility.getSessionFactoryObject();
	  Session session=sessionFactory.openSession();
	  Perfume prdObj=session.get(Perfume.class, 2);
	  
	    prdObj.setPrdPrice(900);
	    Transaction trnx= session.beginTransaction();
	  session.update(prdObj);
	  trnx.commit();
	   session.close();
	   System.out.println(prdObj);
  }
}
 