package edu.training.linearapp.main;
/*
 * Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих 
чисел.
 */

public class Main17 {

	public static void main(String[] args) {

		double a = 3.1;
		double b = -5.6;

		double c = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		double g = Math.sqrt(Math.abs(a) * Math.abs(b));

		System.out.println("Среднее арифметическое кубов чисел равно " + c);
		System.out.println("Среднее геометрическое модулей чисел равно " + g);

	}

}
