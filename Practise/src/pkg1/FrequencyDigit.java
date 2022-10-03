package pkg1;

import java.util.Scanner;

public class FrequencyDigit {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int num,i,count,digit,temp;
	System.out.println("enter any number");
	num=scn.nextInt();
	System.out.println("Digit frequency");
	for(i=0;i<=9;i++) {
		count=0;
		temp=num;
		while(temp>0) {
			digit=temp%10;
			if(digit==i) {
				count++;
			}
			temp=temp/10;
		}
		if(count>0) {
			System.out.println(i+"\t"+count);
		}
	}
}
}
