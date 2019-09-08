package in.co.javacoder.springcore.beanlifecycle.interfaces;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("in/co/javacoder/springcore/beanlifecycle/xmlconfig/springconfig.xml");
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("in/co/javacoder/springcore/beanlifecycle/interfaces/springconfig.xml");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("in/co/javacoder/springcore/beanlifecycle/interfaces/springconfig.xml");
		// The containers reference type is changed from ApplicationContext to AbstractApplicationContext because the registerShutdownHook() is needed to be invoked to activate bean's destroy life cycle callback method.
		context.registerShutdownHook(); // To register a shutdown hook with the JVM. When the spring container shuts down,  it will call the destroy method of all the beans to release the resources(such as memory... etc).
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		
		
	}
}
