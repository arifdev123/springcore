package in.co.javacoder.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("in/co/javacoder/springcore/list/springlist.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		
		System.out.println("Hospital Name : " + hospital.getName());
		
		System.out.println("List type (default) : " + hospital.getSpecialities().getClass());
		
		System.out.println("Specialities are : " + hospital.getSpecialities());
		
		
		
	}

}
