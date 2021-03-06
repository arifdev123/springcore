package in.co.javacoder.springcore.beanlifecycle.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("in/co/javacoder/springcore/beanlifecycle/beanscopes/springconfig.xml");
		Patient patientOne = (Patient) context.getBean("patient");
		System.out.println(patientOne.hashCode());
		
		Patient patientTwo = (Patient) context.getBean("patient");
		System.out.println(patientTwo.hashCode());
		
		
	}
}
