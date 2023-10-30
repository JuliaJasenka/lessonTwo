package edu.training.simplestapp.main;

public class Main05 {

	public static void main(String[] args) {
		int x;
		x = 2_147_483_647;
		//x = 200;
		int temp;
		temp = x + 10;
		if (temp < x) {
		System.out.println("Произошло переполнение.");
		}else {
		System.out.println("Сложение корректно.");
		x = temp;
		System.out.println("Сумма равна " + x);
		}
	}

}
