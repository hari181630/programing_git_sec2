package controlStatement;

import java.util.Scanner;

public class ClassB {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("check condition");
	int age=scn.nextInt();
	if(age!=25) {
		System.out.println("Hi");
	}
	else
	{
		System.out.println("condition false");
	}
	}
}
