package javabasics;

import java.util.Scanner;

public class PrimeNumFactorial {
	public static void main (String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num");
		int num=scan.nextInt();
		int factorial=0;
		System.out.print("Factors of num is" +"  " );
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print( +i +" ");
				factorial++;
			}
			
		}
		System.out.println("\n number of factiorials" +" " +factorial);
		
		if(factorial==2) 
			System.out.println("Given num is Prime number");
		else
			System.out.println("Given num is not aPrime number");
	

} 
	
}
