package controlStatement;

import java.util.Scanner;

public class ClassC {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("check election vote criteria");
	int age=scn.nextInt();
	if(age!=0) {
		if(age>=18) {
			System.out.println("you are eligible for vote");
		}
		else
		{
			System.out.println("you are not eligible for vote");
		}
		
	}
	else
	{
		System.out.println("you are not arrive in the word");
	}
	
}
}
