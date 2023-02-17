package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		
		// Spring의 ApplicationContext 객체
		// ApplicationContext 객체는 Spring bean의 생명주기, 의존성주입을 관리하는 객체
		// 스프링안에서 동작하는 객체들의 관계를 관리하는 객체.
		ApplicationContext context =
				new ClassPathXmlApplicationContext("bean/config.xml");
		
		//config.xml에 id 속성으로 bean을 받아올 수 있다.
//		User anony = (User) context.getBean("anonymous");
//		System.out.println(anony);
		
		Book happy = (Book) context.getBean("happyman");
		System.out.println(happy);
		
		User hong = context.getBean("hong", User.class);
		System.out.println(hong);
		
		User lee =  context.getBean("lee", User.class);
		System.out.println(lee);
		
		Book sam =  context.getBean("sam", Book.class);
		System.out.println(sam);

	}

}
