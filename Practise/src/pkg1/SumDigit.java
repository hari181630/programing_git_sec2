package pkg1;

import java.util.Scanner;

public class SumDigit {
public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	System.out.println("enter any number you want");
	int number = scn.nextInt();
	int i=0;
	int sum=1,rem;
	for(i=1;i<=number;i++) {
	rem=number%10;
	sum=sum*rem;
	number=number/10;
	}
	System.out.println(sum);
	
}
}
