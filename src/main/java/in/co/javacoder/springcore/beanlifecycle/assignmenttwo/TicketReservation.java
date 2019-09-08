package in.co.javacoder.springcore.beanlifecycle.assignmenttwo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	@PostConstruct
	public void initialize() {
		System.out.println("This initializer method is from the TicketREservation class");
	}
 	
	@PreDestroy
	public void cleanUp() {
		System.out.println("This destroy method is from the TicketREservation class");
	}
}
