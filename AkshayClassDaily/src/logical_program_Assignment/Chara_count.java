package logical_program_Assignment;

import java.util.Scanner;

public class Chara_count {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("character count in String");
		String str=scn.next();
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			count++;
		}
		System.out.println(count);
		
	}

}
