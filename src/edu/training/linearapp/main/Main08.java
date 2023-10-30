package edu.training.linearapp.main;

public class Main08 {

	public static void main(String[] args) {
		
		double a = 31;
		double b = 28;
		double c = 47;
		
		double k = Math.pow(b, 2) + 4*a*c;
		double k1 = Math.sqrt(k);
		double h = Math.pow(a, 3);
		double f = Math.pow(b,-2);
		
		double z = ((b + k1)/(2*a)) - h*c +f;
		
		
		
System.out.println(z);
	}

}
