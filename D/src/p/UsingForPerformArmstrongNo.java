package p;

import java.util.Scanner;

public class UsingForPerformArmstrongNo {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter new number");
	int num=scn.nextInt();
	int temp=num;
	int sum=0,rem;
	while(num!=0)
	{
		rem=num%10;
		sum=(rem*rem*rem)+sum;
		num=num/10;
		
	}
	if(sum==temp)
	{
		System.out.println("armstrong number"+sum);
	}
	else
	{
		System.out.println("not armstrong number"+sum);
	}
}
}
