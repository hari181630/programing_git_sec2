package akshay;

import java.util.Scanner;

public class Even_Odd {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter any no");
	int num=scn.nextInt();
	if(num%2==1) {
		System.out.println("odd");
	}
	else
	{
		System.out.println("even");
	}
	
}
}
