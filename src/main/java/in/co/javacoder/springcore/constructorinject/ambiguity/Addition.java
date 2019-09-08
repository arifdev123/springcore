package in.co.javacoder.springcore.constructorinject.ambiguity;

public class Addition {

	public Addition(int a, int b) {
		System.out.println("Inside INT addition method.");
	}

	public Addition(double x, double y) {
		System.out.println("Inside DOUBLE addition method.");
	}
}
