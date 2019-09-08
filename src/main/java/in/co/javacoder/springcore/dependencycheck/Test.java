package in.co.javacoder.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("in/co/javacoder/springcore/dependencycheck/springconfig.xml");
		Prescription prescription = (Prescription) context.getBean("prescription");
		System.out.println(prescription);
		
		
	}
}
