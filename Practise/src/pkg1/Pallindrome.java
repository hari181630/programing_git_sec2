package pkg1;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {


		Scanner scn = new Scanner(System.in);
		System.out.println("enter any number");
		int num=scn.nextInt();//123
		int temp=0;
		int rem,sum=0;
		temp=num;//123
		while(num!=0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
	
	if(sum==temp)//321==123
	{
		System.out.println("pallindrome number"+sum);

	}
	else
	{
		System.out.println("not pallindrome number"+sum);
	}
	}
}
