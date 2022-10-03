package LogicalProgram;

import java.util.Scanner;

public class CountDigit {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter the number");
	int num= scn.nextInt();
	int n;
	int count=0;
	for(int i=0;i<=num;i++) {
		num=num/10;
		count++;
	}
	System.out.println(count);
	CountDigit(){
		
	}

	
	
}

private static void CountDigit() {
	// TODO Auto-generated method stub
	
}
}
