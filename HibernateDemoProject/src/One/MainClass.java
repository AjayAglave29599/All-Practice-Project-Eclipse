package One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction=session.beginTransaction();
	
	Question question=new Question("what is java");
	//q.setqName("");
	
	Answer answer=new Answer("java is programming language");
	//a.setaName("");
	
	answer.setQuestion(question);
	
	session.save(question);
	session.save(answer);
	
	transaction.commit();
	
	session.close();
	sessionFactory.close();

	}

}
