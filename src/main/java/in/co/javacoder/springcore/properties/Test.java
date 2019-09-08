package in.co.javacoder.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("in/co/javacoder/springcore/properties/springconfig.xml");
		CountriesAndLangs countriesAndLangs = (CountriesAndLangs) context.getBean("counLang");
		System.out.println(countriesAndLangs);
	}

}
