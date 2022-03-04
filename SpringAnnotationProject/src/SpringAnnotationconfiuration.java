import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringAnnotationconfiuration {
	
	@Bean(initMethod = "initialize", destroyMethod = "deleting", name = "mybookbean")
    @Scope("singleton")
	public Book getBooKBean()
	{
		return new Book();
	}
	 @Bean(name = "authorBean")
	    @Scope("prototype")
	    public Author getAuthorBean() 				// default bean name
	 {
	        return new Author();
	   }
	

}
