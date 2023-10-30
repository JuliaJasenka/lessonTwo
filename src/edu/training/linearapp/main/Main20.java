package edu.training.linearapp.main;

public class Main20 {

	public static void main(String[] args) {
		
		int C = 24;//длина окружности
		double r; // радиус
		double S; // площадь круга
		
		r = C/(2*Math.PI);
		S = Math.PI*Math.pow(r,2);
		
		String result = String.format("%.2f",S);
		
		System.out.println(S);
		System.out.println("Площадь круга = " + result);

	}

}
