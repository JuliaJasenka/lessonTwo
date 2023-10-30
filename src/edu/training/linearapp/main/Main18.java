package edu.training.linearapp.main;

/*
 * Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба
 */

public class Main18 {

	public static void main(String[] args) {
		
		double rebro = 5;
		
		double sGrani = Math.pow(rebro,2);
		double sKuba = 6*sGrani;
		double vKuba= Math.pow(rebro, 3);
		
		System.out.println("Площадь грани куба равна "+sGrani);
		System.out.println("Площадь поверхности куба равна "+sKuba);
		System.out.println("Объем куба равен "+vKuba);

	}

}
