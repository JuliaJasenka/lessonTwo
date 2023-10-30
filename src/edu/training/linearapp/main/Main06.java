package edu.training.linearapp.main;

/*
 * Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших 
бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
 */

public class Main06 {

	public static void main(String[] args) {
		 int n=2;
		 int m=4;
		 
		 int oneBig = 80/n+12;
		 int big = oneBig*m;
		 
		 System.out.println("литров молока в m больших бидонах = "+big);

	}

}
