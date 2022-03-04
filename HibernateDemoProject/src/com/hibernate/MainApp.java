package com.hibernate;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory  sessionfactory=new Configuration().configure().buildSessionFactory();
		
		Session session= sessionfactory.openSession();
		org.hibernate.Transaction transaction =session.beginTransaction();
		Person person=new Person();
		person.setPersonId(2);
		person.setPersonName("Ajay");
		session.save(person);
		transaction.commit();
	}

}
