package configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("configuration");
		
		Book harryPorter = context.getBean("lon", Book.class);
		
		//id값을 입력하지 않아도 Bean의 정보는 출력된다
		User admin = context.getBean(User.class);
		Rent rent = context.getBean("rent", Rent.class);
		
		System.out.println(harryPorter);
		System.out.println(admin);
		rent.info();
		
	}
}
