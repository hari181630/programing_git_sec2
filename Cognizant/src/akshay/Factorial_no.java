package akshay;

import java.util.Scanner;

public class Factorial_no {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter any number");
		int num=scn.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
