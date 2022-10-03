package pkg1;

import java.util.Scanner;

public class FirstNLastDi {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter any number");
		int x1=scn.nextInt();
		x1=x1%10;
		System.out.println("lastDigit= "+x1);
		m1(78564);
		
	}
	public static void m1(int x1) {
		int fDigit=0;
		 fDigit= x1;
		 while(fDigit>=10) {
			 fDigit=fDigit/10;
		 }
		 System.out.println("first digit"+x1+"="+fDigit);
		
	}
	
}
