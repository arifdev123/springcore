package in.co.javacoder.springcore.beanlifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("This setter method of the field id in the bean " +this.getClass().getName());
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	public void hi() {
		System.out.println("Init method - hi of " + this.getClass().getName() + " bean has been invoked.");
	}
	
	public void bye() {
		System.out.println("Destroy method - bye of " + this.getClass().getName() + " bean has been invoked.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet method ");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method ");
	}

}
