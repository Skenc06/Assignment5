package assignment5;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter final number to print odd numbers");
		int finalNumber= scan.nextInt();
		
		int i=1;		
		String virgola="";
		
		while(i<=finalNumber) {
			
			if(i%2==1) {
			System.out.print(virgola+i);
			virgola=", ";	
			
			}			
		i++;
		}
		
	} 

}
