package in.co.javacoder.springcore.propertyplaceholder.assignmentThree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"in/co/javacoder/springcore/propertyplaceholder/assignmentThree/springconfig.xml");
		WebService ws = (WebService) context.getBean("webService");
		System.out.println(ws);

	}

}
