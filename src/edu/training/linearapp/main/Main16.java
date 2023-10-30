package edu.training.linearapp.main;

/*
 * Найти произведение цифр заданного четырехзначного числа
 */

public class Main16 {

public static void main(String[] args) {
		
	int a = 1234;
	
	int mult=1;
	
	for(int i =0;i<4;i++) {
		 
		mult *= a%10;
		a/=10;
	}
	
	System.out.println("Произведение = " +mult);
	
	
	}
}
