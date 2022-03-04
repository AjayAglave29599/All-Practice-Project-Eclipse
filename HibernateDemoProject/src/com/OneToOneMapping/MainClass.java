package com.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory  sessionfactory=new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();
		
		Session session=sessionfactory.openSession();
		
		org.hibernate.Transaction transaction= session.beginTransaction();
		
		Question q=new Question();
		q.setQuestionId(1);
		q.setQuestion("what is java");
		
		Answer a=new Answer();
		a.setAnswerid(11);
		a.setAnswer(" java is programing language");
		q.setAnswer(a);
		
		session.save(q);
		session.save(a);
		
		transaction.commit();
		
		session.close();
		sessionfactory.close();
	
		
		// Durgesh
		
//		Configuration cfg=new Configuration();
//		
//		cfg.configure("hibernate1.cfg.xml");
//		SessionFactory factory=cfg.buildSessionFactory();
//		
//		Question q=new Question();
//		q.setQuestionId(1);
//		q.setQuestion("what is java");
//		
//		Answer a=new Answer();
//		a.setAnswerid(11);
//		a.setAnswer(" java is programing language");
//		q.setAnswer(a);
//		
//		
//		Session s=factory.openSession();
//		
//		Transaction t=s.beginTransaction();
//		
//		s.save(q);
//		
//		t.commit();
//		s.close();
//		
//		factory.close();
//		
	}

}
