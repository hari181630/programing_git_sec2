package pkg1;

import java.util.Scanner;

public class FirstLastDigit {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter any number you want");
	int number =scn.nextInt();
	int fDigit=0;
	int lDigit=0;
	lDigit=number%10;
	System.out.println(lDigit);
	fDigit=number;
	while(fDigit>=5) {
		fDigit=fDigit/10;
	}
	System.out.println(fDigit);
	System.out.println(fDigit+lDigit);
	System.out.println(fDigit*lDigit);
	System.out.println("Before Swaping no"+lDigit+" "+fDigit);
	int temp=0;
	temp=fDigit;
	fDigit=lDigit;
	lDigit=temp;
	System.out.println("After Swaping no"+lDigit+" "+fDigit);
	}
}

