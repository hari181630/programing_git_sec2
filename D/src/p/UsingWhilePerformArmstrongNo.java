package p;

import java.util.Scanner;

public class UsingWhilePerformArmstrongNo {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter new number");
	int num=scn.nextInt();
	int temp=num;
	int sum=0,rem;
	for(;num!=0;num/=10)
	{
		rem=num%10;
		sum=sum+(rem*rem*rem);
	}
	if(sum==temp)
	{
		System.out.println("armstrong number :"+sum);
	}
	else
	{
		System.out.println("not armstrong number :"+sum);
	}
	
}
}
