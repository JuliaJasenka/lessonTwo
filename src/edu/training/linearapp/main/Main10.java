package edu.training.linearapp.main;
/*
 * 
 */

public class Main10 {

	public static void main(String[] args) {

		double x = 1.5;
		double y = 1.6;
		double z;

		z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x) * y;

		z = Math.toDegrees(z);

		System.out.println("Значение функции z равно " + z + " градусов");
	}

}
