package in.co.javacoder.springcore.beanlifecycle.beanscopes.assignmentthree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("in/co/javacoder/springcore/beanlifecycle/beanscopes/assignmentthree/springconfig.xml");
		University universityOne = (University) context.getBean("university");
		System.out.println(universityOne);
		
		University universityTwo = (University) context.getBean("university");
		System.out.println(universityTwo);
	}
}
