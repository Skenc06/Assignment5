package assignment5;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);		
		
		System.out.println("Please enter the number:");
		int number=scan.nextInt();
		
		while(number<100) {
			number=number*10;
			System.out.println("The result is: "+ number);
		}
			
	}

}
