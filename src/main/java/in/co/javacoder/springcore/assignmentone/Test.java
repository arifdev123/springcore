package in.co.javacoder.springcore.assignmentone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("in/co/javacoder/springcore/assignmentone/springconfig.xml");
		ShoppingCart cart = (ShoppingCart) context.getBean("cart");
		System.out.println(cart);
	}

}
