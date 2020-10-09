package assignment5;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int num1=0;
		int num2=1;				
		int num3;		
		int n=100;
		
		System.out.println("Please enter the number");
		n=scan.nextInt();
		System.out.print(num1 + ", " + num2);	
		
		for(int i=2 ; i<n; i++) {		
			num3=num1+num2;
			
			System.out.print(", " + num3);
			num1=num2;
			num2=num3;			
		}

	}

}
