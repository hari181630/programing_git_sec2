package pkg1;

import java.util.Scanner;

public class CountNoDigit {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("count no digit");
	long temp=scn.nextInt();
	int count=0;
	for(int i=0;i<=temp;i++) {
		temp=temp/10;
		count++;
	}
	
	
	System.out.println(count);
}
}
//public static void m1() //{
//	int i=0;
//	while(123!=0) {
//		i++;
//	}
//	System.out.println(i);

