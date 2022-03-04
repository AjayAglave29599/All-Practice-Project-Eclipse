//import java.lang.module.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {
	 
	//SessionFactory session =new Configuration().Configure().buildSessionFactory();
	//SessionFactory fact=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	Configuration con=new Configuration();
	con.Configure("hibernatecfg.xml");
	

}
