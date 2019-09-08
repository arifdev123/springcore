package in.co.javacoder.springcore.list;

import java.util.List;

public class Hospital {

	private String name;
	private List<String> specialities;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSpecialities() {
		return specialities;
	}
	public void setSpecialities(List<String> specialities) {
		this.specialities = specialities;
	}
	
	
}
