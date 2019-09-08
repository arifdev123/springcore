package in.co.javacoder.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("in/co/javacoder/springcore/set/springset.xml");
		CarDealer carDealer = (CarDealer) context.getBean("cardealer");
		
		System.out.println("Car Dealer name : " + carDealer.getName());
		System.out.println("Car models : " +carDealer.getModels());
		
		
	}

}
