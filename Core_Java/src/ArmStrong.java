ackage LogicalProgram;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		int rem,sum=0,i=0,temp;
		System.out.println("print armStrong number");
		Scanner scn = new Scanner(System.in);
		int num=scn.nextInt();
		temp=num;
		while(num!=0) {
			rem=num%10;
			sum=(rem*rem*rem)+sum;
			num=num/10;
	}
		if(temp==sum) {
			System.out.println("armstrong number"+sum);
		}
		else
		{
			System.out.println("its not armstrong number"+sum);
		}
	}
}
