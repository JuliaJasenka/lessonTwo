package edu.training.linearapp.main;

public class Main13 {
	/*
	 * Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти
	 * его периметр и площадь.
	 * d= √(x2−x1)^2+(y2−y1)^2 формула нахождения расстояние между двумя точками 
	 * 
	 */

	public static void main(String[] args) {
		int x1 = 2;
		int x2 = 3;
		int x3 = 4;
		int y1 = 6;
		int y2 = 7;
		int y3 = 8;

		 // длины сторон треугольника
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        double p = a + b + c;
        double pHalf = p / 2.0;
        double s = Math.sqrt(pHalf * (pHalf - a) * (pHalf - b) * (pHalf - c)); // формула Герона

        System.out.println("Периметр треугольника P = " + p);
        System.out.println("Площадь треугольника S = " + s);
      	}

}
