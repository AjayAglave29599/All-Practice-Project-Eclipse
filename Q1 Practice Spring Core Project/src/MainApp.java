import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main (String [] args)
	{
	    ClassPathXmlApplicationContext classPathXmlApplicationContext = 
	    		new ClassPathXmlApplicationContext("NewFile.xml");
	    
	    Employee employee=(Employee) classPathXmlApplicationContext.getBean("Employee_bean");
	    Laptop laptop=(Laptop) classPathXmlApplicationContext.getBean("Laptop_bean_const");
	    Employee employee1=(Employee) classPathXmlApplicationContext.getBean("Employee_bean1");

	    System.out.println(employee);
	    System.out.println(laptop);
	    System.out.println(employee1);
	    
	}

}
