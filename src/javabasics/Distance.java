package javabasics;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the speed");
int speed=scan.nextInt();
System.out.println("enter the time");
int time=scan.nextInt();
System.out.print("Hour"   +"      "  +"Dtstance Travelled");
System.out.print("\n----------------------------");
for(int i=1; i<=time  ;i++) {
	
	int distaceTraveled=i*speed;
	System.out.print("\n"   +i +"           "    +distaceTraveled);
	
	
	
	
	
}



	}

}
