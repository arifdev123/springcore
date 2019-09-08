package in.co.javacoder.springcore.beanlifecycle.beanscopes;

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
	
	
}
