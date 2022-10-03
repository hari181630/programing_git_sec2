package pkg1;

import java.util.Scanner;

public class K1 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("entr arm no");
	int num=scn.nextInt();
	int rem,sum=0,temp=0;
	int i=0;
	temp=num;
	while(num>0) {
		rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
	}
	if(temp==sum)
	System.out.println("Arm"+sum);
	else
		System.out.println("arm not"+sum);
}
}
