package pkg1;

import java.util.Scanner;

public class example1_Accept_input_from_user {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter any number from user:");
		int num1 = scn.nextInt();//accept int from user
		System.out.println(num1);
		System.out.println("enter multiple input10");
		int num2 = scn.nextInt();
		System.out.println(num2);
		System.out.println(num1 + num2+"  is addition");
		

	}

}
