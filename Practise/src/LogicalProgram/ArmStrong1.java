package LogicalProgram;

import java.util.Scanner;

public class ArmStrong1 {
public static void main(String[] args) {
	int i=0,sum=0,rem,temp;
	Scanner scn =new Scanner(System.in);
	System.out.println("enter any number");
	int num=scn.nextInt();
	temp=num;
	for(i=0;num!=0;i++) {
		rem=num%10;
		sum=(rem*rem*rem)+sum;
		num=num/10;
	}
	if(temp==sum) {
		System.out.println("Armstrong number"+sum);
	}
	else
	{
		System.out.println("not ArmStrong number"+sum);
	}
}
}
