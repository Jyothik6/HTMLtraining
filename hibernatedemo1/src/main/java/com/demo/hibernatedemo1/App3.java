
package com.demo.hibernatedemo1;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.hibernatedemo1.config.HibernateUtility;
import com.demo.hibernatedemo1.entities.Perfume;
 
public class App3 {
  public static void main(String[] args) {
	  SessionFactory sessionFactory=HibernateUtility.getSessionFactoryObject();
   Perfume prdObj=new Perfume(1,"KS","DARE",700);
   
    Session session=sessionFactory.openSession();
  Transaction trnx= session.beginTransaction();
  session.delete(prdObj);
   trnx.commit();
  session.close();
   
   System.out.println(prdObj);
   
  }
}
 