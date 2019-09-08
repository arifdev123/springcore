package in.co.javacoder.springcore.properties;

import java.util.Properties;

public class CountriesAndLangs {
	
	private Properties contryAndLangs;

	public Properties getContryAndLangs() {
		return contryAndLangs;
	}

	public void setContryAndLangs(Properties contryAndLangs) {
		this.contryAndLangs = contryAndLangs;
	}

	@Override
	public String toString() {
		return "CountriesAndLangs [contryAndLangs=" + contryAndLangs + "]";
	}
	
	
}
