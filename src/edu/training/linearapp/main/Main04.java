package edu.training.linearapp.main;

/* 
 * Найти значение функции z = ( (a – 3 ) * b / 2) + c
 */

public class Main04 {
	
	public static void main(String[] args) {
		
		int a = 6;
		int b = 10;
		int c = 13;
		int z;
		int res;
		int quot;
		
		res = a-3;
		quot = b/2;
		
		z = res*quot+c;
		
		System.out.println("z равно " + z);
			

	}

}
