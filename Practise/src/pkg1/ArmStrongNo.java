package pkg1;

import java.util.Scanner;

public class ArmStrongNo {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter the number");
	int num=scn.nextInt();
	int arm=0,temp=0,rem;
	temp=num;
	while(num!=0) {
		rem=num%10;
		arm=arm+rem*rem*rem;
		num=num/10;
	}
	if(arm==temp) {
		System.out.println("Armstrong number"+arm);
	}
	else
	{
		System.out.println("Armstrong number"+arm);
	
	}
}
}
