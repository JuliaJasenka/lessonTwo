package edu.training.linearapp.main;

public class Main11 {

	public static void main(String[] args) {
		double a = 5;
		double b = 9;
		
		double k = Math.pow(a, 2)+Math.pow(b, 2);// квадраты катетов + сумма
		double k1 = Math.sqrt(k); // корень квадратный суммы квадратов катетов
		
		double P = k1+a+b;// периметр треугольника
		double S = a*b/2;// площадь треугольника
		
		System.out.println("периметр прямоугольного треугольника = " +P);
		System.out.println("площадь прямоугольного треугольника = "+S);
		

	}

}
