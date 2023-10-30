package edu.training.linearapp.main;

public class Main12 {
	/*
	 * Вычислить расстояние между двумя точками с данными координатами (х1, у1)и
	 * (x2, у2)
	 * 
	 * d= √(x2−x1)^2+(y2−y1)^2 формула нахождения расстояние между двумя точками
	 */

	public static void main(String[] args) {
		int x1 = 3;
		int x2 = 7;
		int y1 = 6;
		int y2 = 8;

		double d = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));

		System.out.println("Расстояние между точками равно " + d);

	}

}
