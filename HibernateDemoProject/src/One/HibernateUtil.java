package One;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory=null;
	
	static
	{
		try {
			sessionFactory=new Configuration().configure("hiber.cfg.xml").buildSessionFactory();
			} 
		catch (Throwable e) 
		{
			System.out.println("hello");
			throw new ExceptionInInitializerError(e);
		}
	}
	
   public static SessionFactory getSessionFactory()
   {
	   return sessionFactory;
   }
	
	

}
