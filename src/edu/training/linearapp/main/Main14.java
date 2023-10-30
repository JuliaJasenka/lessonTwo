package edu.training.linearapp.main;

public class Main14 {

	public static void main(String[] args) {
		/*
		 * A= Пr^2 - площадь круга 
		 * C = 2Пr - длина окружности
		 */

		double r = 4;
		double A;
		double C;

		A = Math.PI * Math.pow(r, 2);
		C = 2 * Math.PI * r;

		System.out.println(A);
		System.out.println(C);

	}

}
