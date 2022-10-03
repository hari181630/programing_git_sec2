package akshay;

import java.util.Scanner;

public class ArmStrong_No {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter any armstrong number");
		int ArmNo=scn.nextInt();
		int rem,temp=0,sum=0;
		temp=ArmNo;
		while(ArmNo!=0) {
			rem=ArmNo%10;
			sum=sum+(rem*rem*rem);
			ArmNo=ArmNo/10;
			
		}
		if(sum==temp) {
			System.out.println("Armstrong no");
		}
		else
		{
			System.out.println("not Armstrong");
		}
	}

}
