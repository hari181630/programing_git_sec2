package p;

import java.util.Scanner;

public class P1 {
	
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter any number");
	int num=scn.nextInt();
	int sum=0,rem;
	int temp=num;
	
	for(;num!=0;num/=10) {
		rem=num%10;
		sum=sum+(rem*rem*rem);
		
	}
	if(sum==temp)
	{
		System.out.println("armstrong number"+sum);
	}
	else
	{
		System.out.println("not a armstrong number"+sum);
	}
}
}
