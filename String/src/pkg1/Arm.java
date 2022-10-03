package pkg1;

import java.util.Scanner;

public class Arm {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int num=scn.nextInt();
	System.out.println(num);
	int sum=0,rem;
	int temp=0;
	while(num!=0) {
		rem=num%10;
		sum=sum+(rem* rem *rem);
		num=num/10;
	}
	if(sum==temp)
	{
		System.out.println("arm");
	}
	else
	{
		System.out.println("not arm");
	}
}
}
