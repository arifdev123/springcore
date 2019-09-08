package in.co.javacoder.springcore.beanlifecycle.xmlconfig; 

public class Patient {
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

}
