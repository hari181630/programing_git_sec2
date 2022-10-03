package logical_program_Assignment;

import java.util.Scanner;

public class Arm_no_1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num= scn.nextInt();
		int rem,arm=0,temp=0;
		temp=num;
		while(num!=0) {
			rem=num%10;
			arm=arm+(rem*rem*rem);
			num=num/10;
		}
		if(arm==temp)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not armstrong number");
		}
	}

}
