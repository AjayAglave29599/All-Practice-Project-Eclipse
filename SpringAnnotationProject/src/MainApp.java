import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	       
	        AnnotationConfigApplicationContext annotationConfigApplicationContext=
	        		new AnnotationConfigApplicationContext(SpringAnnotationconfiuration.class);
	        
	        Book book=(Book)annotationConfigApplicationContext.getBean("mybookbean");
	        Author author=(Author) annotationConfigApplicationContext.getBean("authorBean");
	        System.out.println(book);
	        System.out.println(author);
	        
//	        book.setIsbn(10);
//	        book.setTitle("java");
	        
	       
	    }

}
