package edu.training.linearapp.main;

/*
 * Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы 
вписанной и описанной окружностей
 */

public class Main19 {

	public static void main(String[] args) {
		
		double side = 6;
				
		double height = (side*Math.sqrt(3))/2;
		double S = (side*height)/2;
		double r = side*(Math.sqrt(3)/6);// радиус вписанной окружности
		double R = 2*r;// радиус описанной окружности
		

		System.out.println("Площадь равностороннего треугольника равна " + S);
		System.out.println("Высотра равностороннего треугольника равна " + height);
		System.out.println("Радиус вписанной окружности равен " + r);
		System.out.println("Радиус описанной окружности равен " + R);
	}

}
